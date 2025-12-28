package Cookies;

import java.util.Arrays;

public class Cookies {

    private double bestSTD = Integer.MAX_VALUE;
    // a very big number for a starting point
    private int[] bestDistribution;
    private int[] cookies;
    private int nChildren;

    public Cookies(int[] cookies, int nChildren){
        
    	this.cookies = cookies;
    	this.nChildren = nChildren;
    	
    	bestDistribution = new int [nChildren];
    }

    public static double calculateSD(int[] numArray)
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    public void distributeCookies() {
        
    	distributeHelper(cookies, 0, bestDistribution);
    }

    private void distributeHelper(int[] cookies, int curBag, int[] children) {
    	
    	//base case (stops recursion when all cookies have been distributed)
    	if (curBag == cookies.length) {
    		
    		double temp = calculateSD(children);
    		
    		//replacing stdev with better ones
    		if (temp < bestSTD) {
    			
    			bestSTD = temp;
    			
    			//copy the better distribution in the best distrubution
    			for (int j = 0; j < children.length; j++) {
    				
    				bestDistribution[j] = children[j];
    			}
    		}
    		
    		//stops recursion
    		return;
    	}
    	
    	//recursive step (checking all combos)
    	for (int i = 0; i < children.length; i++) {
    		
    		//adds cookies to child
    		children[i] += cookies[curBag];
    		
    		distributeHelper(cookies, curBag + 1, children);
    		
    		//backtracking 
    		children[i] -= cookies[curBag];
    	}
    }

    public int[] getBestDistribution(){
    	
    	return bestDistribution;
    }
    public double getBestSTD(){
       
    	return bestSTD;
    }
}

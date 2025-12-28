
public class RecursionQuestions {
	
	//private static  String rev = "";
	private static int i = 1;
	
	public static String reverseString(String str) {
		
		String rev = "";
		
		if (str.length() == 1) { return str; } 
		
		else {
			
			rev += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));

			return rev;
		}
	}
		
		public static boolean isSorted(int[] array, int index) {
			
			if (index < 2) {
				
				return true;
			}
			
			else {
				
				if (array[index - 1] >= array[index - 2] ) {
					
					return isSorted(array, index - 1);	
				}
				
				return false;
			}

			}
			
			
		}


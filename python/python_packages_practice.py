import math
import matplotlib.pyplot as plt
import statsmodels.api as sm
import numpy
from scipy.linalg import sqrtm

"""
1. page 80, 2.2, a, b, d−f
2. page 81, 2.7, c, and comment on the scatter plot and q − q plot you drew.
3. page 81, 2.11
4. page 82, 2.19
"""

#QUESTION 1 (2.2)

#data set
age = [ 13, 15, 16, 16, 19, 20, 20,
        21, 22, 22, 25, 25, 25, 25,
        30, 33, 33, 35, 35, 35, 35,
        36, 40, 45, 46, 52, 70.]

#a)
print("mean age: ", numpy.mean(age))
print("median age: ", numpy.median(age))

#f)
plt.boxplot(age)
plt.ylabel('Age')
plt.show()

#QUESTION 2 (2.7)

#data set
age = [23, 23, 27, 27, 39, 41, 47, 49, 50,
       52, 54, 54, 56, 57, 58, 58, 60, 61 ]

fat = [9.5, 26.5, 7.8, 17.8, 31.4, 25.9, 27.4, 27.2, 31.2,
       34.6, 42.5, 28.8, 33.4, 30.2, 34.1, 32.9, 41.2, 35.7]

#c)
plt.scatter(age, fat)
plt.show()
sm.qqplot_2samples(numpy.array(age), numpy.array(numpy.sort(fat)), line='45')
plt.show()

#QUESTION 3 (2.11)

#2D data set
a1 = [1.5, 2, 1.6, 1.2, 1.5, 1.4]
a2 = [1.7, 1.9, 1.8, 1.5, 1, 1.6]

#new data point (query)
x = [1.4, 1.6]

#a)
#Calculating Euclidean Distance
print(math.sqrt((a1[0] - x[0]) ** 2 + (a2[0] - x[1]) ** 2))
print(math.sqrt((a1[1] - x[0]) ** 2 + (a2[1] - x[1]) ** 2))
print(math.sqrt((a1[2] - x[0]) ** 2 + (a2[2] - x[1]) ** 2))
print(math.sqrt((a1[3] - x[0]) ** 2 + (a2[3] - x[1]) ** 2))
print(math.sqrt((a1[4] - x[0]) ** 2 + (a2[4] - x[1]) ** 2))

#Calculating Manhattan Distance

print(abs(a1[0] - x[0]) + abs(a2[0] - x[1]))
print(abs(a1[1] - x[0]) + abs(a2[1] - x[1]))
print(abs(a1[2] - x[0]) + abs(a2[2] - x[1]))
print(abs(a1[3] - x[0]) + abs(a2[3] - x[1]))
print(abs(a1[4] - x[0]) + abs(a2[4] - x[1]))

#Calculating Supremum Distance

print(max(abs(a1[0] - x[0]), abs(a2[0] - x[1])))
print(max(abs(a1[1] - x[0]), abs(a2[1] - x[1])))
print(max(abs(a1[2] - x[0]), abs(a2[2] - x[1])))
print(max(abs(a1[3] - x[0]), abs(a2[3] - x[1])))
print(max(abs(a1[4] - x[0]), abs(a2[4] - x[1])))

#Calculating Cosine Similarity

#calculating the norm
x_bar = math.sqrt((x[0] ** 2) + (x[1] ** 2))

#THE TWO LINES BELOW ARE USED FOR INITIAL TESTING
#dot_prod = a1[0] * x[0] + a2[0] * x[1]
#norm = math.sqrt(a1[0] ** 2 + a2[0] ** 2)

#calculating cosine sim

print((a1[0] * x[0] + a2[0] * x[1])/ (x_bar * math.sqrt(a1[0] ** 2 + a2[0] ** 2)))
print((a1[1] * x[0] + a2[1] * x[1])/ (x_bar * math.sqrt(a1[1] ** 2 + a2[1] ** 2)))
print((a1[2] * x[0] + a2[2] * x[1])/ (x_bar * math.sqrt(a1[2] ** 2 + a2[2] ** 2)))
print((a1[3] * x[0] + a2[3] * x[1])/ (x_bar * math.sqrt(a1[3] ** 2 + a2[3] ** 2)))
print((a1[4] * x[0] + a2[4] * x[1])/ (x_bar * math.sqrt(a1[4] ** 2 + a2[4] ** 2)))


#b)
#normalizing the data
meanA1 = numpy.mean(numpy.array(a1))
stdA1 = numpy.std(numpy.array(a1))
meanA2 = numpy.mean(numpy.array(a2))
stdA2 = numpy.std(numpy.array(a2))

norm_a1 = (numpy.array(a1) - meanA1) / stdA1
norm_a2 = (numpy.array(a2) - meanA2) / stdA2

print(norm_a1)
print(norm_a2)

norm_query = numpy.array(x) / numpy.linalg.norm(x)

#calculating euclidean distance

print(math.sqrt((norm_a1[0] - norm_query[0]) ** 2 + (norm_a2[0] - norm_query[1]) ** 2))
print(math.sqrt((norm_a1[1] - norm_query[0]) ** 2 + (norm_a2[1] - norm_query[1]) ** 2))
print(math.sqrt((norm_a1[2] - norm_query[0]) ** 2 + (norm_a2[2] - norm_query[1]) ** 2))
print(math.sqrt((norm_a1[3] - norm_query[0]) ** 2 + (norm_a2[3] - norm_query[1]) ** 2))
print(math.sqrt((norm_a1[4] - norm_query[0]) ** 2 + (norm_a2[4] - norm_query[1]) ** 2))

#QUESTION 4 (2.19)

#a)
#z score normalization
meanAge = numpy.mean(numpy.array(age))
stdAge = numpy.std(numpy.array(age))
meanFat = numpy.mean(numpy.array(fat))
stdFat = numpy.std(numpy.array(fat))

norm_age = (numpy.array(age) - meanAge) / stdAge
norm_fat = (numpy.array(fat) - meanFat) / stdFat

print(norm_age)
print(norm_fat)

#b)
#computing correlation and covariance
corrCoff = numpy.corrcoef(age, fat)
print(corrCoff)
corVar = numpy.cov(age, fat)
print(corVar)






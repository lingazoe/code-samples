#Zoe Linga
#220610960

import pandas as pd
from sklearn.metrics import accuracy_score
from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsClassifier
from sklearn.preprocessing import MinMaxScaler

df = pd.read_csv("sampledSeeds.csv", sep=',')

#changes accordingly to 3, 5, or 7
k_value = 7

x = df.drop('Class', axis=1)
y = df['Class']

x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2)

knn_classify = KNeighborsClassifier(n_neighbors=k_value)

#tuple to predict
new_tuple = [[16.17, 15.38, 0.8588, 5.762, 3.387, 4.286, 5.703]]

#part of Question 2 part B
def min_max_scaler_model(new_xs, new_ys):
    scaler = MinMaxScaler()
    scaled = pd.DataFrame(scaler.fit_transform(x), columns=x.columns, index=x.index)

    new_x_train, new_x_test, new_y_train, new_y_test = train_test_split(new_xs, new_ys, test_size=0.2)

    new_tuple_scaled = scaler.transform([[16.17, 15.38, 0.8588, 5.762, 3.387, 4.286, 5.703]])

    return [new_tuple_scaled, new_x_train, new_y_train]

knn_classify.fit(x_train, y_train)

print('*Note: Change the K value in the code (above)*\n')

#Question 2 Part A
print('Standard Classification:')

print('K =', k_value)
print('Tuple to Classify: ', new_tuple)

new_pred = knn_classify.predict(new_tuple)

#Question 2 Part B
print('Prediction:', new_pred)

print('-------------')

print('MinMax Classification:')

[new_minmax_tuple, new_x, new_y] = min_max_scaler_model(x, y)

knn_classify.fit(new_x, new_y)

print('K =', k_value)
print('Tuple to Classify: ', new_minmax_tuple)

new_pred = knn_classify.predict(new_minmax_tuple)

print('Prediction:', new_pred)













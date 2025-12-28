import pandas as pd
from sklearn.metrics import accuracy_score
from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsClassifier
from sklearn.preprocessing import MinMaxScaler

k_value = 7

df = pd.read_csv("sampledSeeds.csv", sep=',')

x = df.drop('Class', axis=1)
y = df['Class']

scaler = MinMaxScaler()
scaled = pd.DataFrame(scaler.fit_transform(x), columns=x.columns, index=x.index)

# x = df.drop('Class', axis=1)
# y = df['Class']

x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2)

knn_classify = KNeighborsClassifier(n_neighbors=k_value)
knn_classify.fit(x_train, y_train)

new_tuple_scaled = scaler.transform([[16.17, 15.38, 0.8588, 5.762, 3.387, 4.286, 5.703]])

print('K =', k_value)
print('Tuple to Classify: ', new_tuple_scaled)

new_pred = knn_classify.predict(new_tuple_scaled)

print('Prediction:', new_pred)
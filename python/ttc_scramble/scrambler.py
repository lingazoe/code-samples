from random import shuffle

import pandas as pd
import random

class scrambler:

    ttc_df = pd.read_csv('ttc_subway_stations_2025.csv')

    random_series = ttc_df['subway_stations'].tolist()

    def __init__(self, random_series=ttc_df['subway_stations'].tolist(), shuffled_series='', difficulty=0, score=0, comparisons='', max=0):

        self.random_series = random_series
        self.shuffled_series = self.random_series.copy()
        self.difficulty = difficulty
        self.score = score
        self.comparisons = comparisons
        self.max = max

    def _scramble(self):

        random.shuffle(self.random_series)
        self.shuffled_series = self.random_series.copy()

    """
    Difficulties:

    0 - Easy Mode: Spaces (also randomized), Capitalization
    1 - Hard Mode: No Spaces, No Capitalization

    """

    def _shuffle(self):

        #shuffle each stations
        for i in range(len(self.shuffled_series)):

            self.shuffled_series[i] = str(self.shuffled_series[i])
            temp = list(self.shuffled_series[i])
            random.shuffle(temp)
            self.shuffled_series[i] = ''.join(temp)

        return self.shuffled_series

    #calls shuffle
    def _hard_shuffle(self):

        self._shuffle()

        for i in range(len(self.shuffled_series)):

            self.shuffled_series[i] = str(self.shuffled_series[i])

            #no spaces
            self.shuffled_series[i] = self.shuffled_series[i].replace(' ', '')

            #no caps
            self.shuffled_series[i] = self.shuffled_series[i].lower()

        return self.shuffled_series

    def guessing(self):

        for i in range(self.max):
            print(f"{i + 1}. {self.shuffled_series[i]}")
            #print(self.random_series[i])
            guess = input("Take a guess: ")

            if guess == self.random_series[i]:
                print("")
                self.score += 1
            else:
                print("")


    def play(self):

        self._scramble()

        self.difficulty = input('Enter difficulty: ')
        self.max = int(input('Enter max stations: '))

        if self.difficulty == '0':
            self._shuffle()
            self.guessing()
        elif self.difficulty == '1':
            self._hard_shuffle()
            self.guessing()

        print('Your score is: ', self.score)

start = scrambler()
start.play()
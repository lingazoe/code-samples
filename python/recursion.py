def printing(number):

    if number == 0:
        return number
    else:
        printing(number-1)
        print(number)
        return number

def multiply(x, y):

    if y == 0:
        return 0
    else:
        return x + multiply(x, y-1)

def lines(n):

    if n == 0:
        return
    else:
        lines(n-1)
        for i in range(n):
            print('*', end=' ')
        print()

def large_list(new_list):

    if len(new_list) == 1:
        return new_list
    else:
        if new_list[0] > new_list[-1]:
            print(new_list)
            return large_list(new_list[:-1])
        else:
            print(new_list)
            return large_list(new_list[1:])

def sum_list(new_list):

    if len(new_list) == 0:
        return 0
    else:
        return new_list[0] + sum_list(new_list[1:])

def sum_num(num):
    if num == 0:
        return 0
    else:
        return num + sum_num(num-1)

def power(x, n):
    if n == 0:
        return 1
    else:
        return x * power(x, n-1)

def ackermann(m, n):
    if m == 0:
        return n + 1
    if n == 0:
        return ackermann(m-1, 1)
    else:
        return ackermann(m-1, ackermann(m, n-1))


#print(printing(10))
#print(multiply(11, 3))
#print(lines(5))
#print(large_list([42, 67, 34, 91, 12, 88, 23, 76, 55, 42]))
#print(sum_list([1, 2, 3, 4, 5]))
#print(sum_num(100))
#print(power(8, 3))

print(ackermann(1, 3))





def sqrt(x):
    guess = 1.0
    while not good_enough(guess, x):
        guess = improve(guess, x)
    return guess

def improve(guess, x):
    return average(guess, x / guess)

def average(x, y):
    return (x + y) / 2

def good_enough(guess, x):
    return abs(guess**2 - x) < 1e-12 #вернём абсолютную величину

x = int(input('Введи число?: '))
if x < 0:
    print('Вы ввели отрицательное число!')
    print('У отрицательных чисел не может быть квадратных корней!')
else:
    y = sqrt(x)
    z = int(y * 100)/100 #оставим 2 знака после запятой
    print(z)

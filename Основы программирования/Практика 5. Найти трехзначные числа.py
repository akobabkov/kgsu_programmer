#Составить программу находящую трехзначные числа ABC, что бы ABC = a!+b!+c!
def fact(z):
    p=1
    for i in range(1,z+1):
        p*=i
    return p

flag = False #ниодного числа
for i in range(100,1000):
    x=i
    c=x%10
    x=x//10
    b=x%10
    x=x//10
    a=x%10
    Sum = fact(a) + fact(b)+ fact(c)
    if i == Sum:
        print(i)
        flag=True
if flag==False:
    print("Таких чисел нет")
#найти номер элемента числового списка, значение которого равно сумме первого и последнего элемента того же списка
N = int(input('Кол-во элементов списка '))
a = []
print('Элементы списка')
for i in range(0,N):
    b=int(input(''))
    a.append(b)    
sum = a[0] + a[len(a) -1]
flag=False
for i in range(0,len(a)):
    if sum==a[i]:
        print(i)
        flag=True
if flag==False:
    print("Такого элемента нет")

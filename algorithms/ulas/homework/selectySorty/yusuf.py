from random import randint


list = []

for i in range(50):
	list.append(randint(10, 99))

for i in range(len(list)):
    min = i
    print(list)
    for j in range(i, len(list)):
        if list[j] < list[min]:
            min = j
        temp = list[i]
        list[i] = list[min]
        list[min] = temp

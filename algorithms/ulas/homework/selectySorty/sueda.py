def selectionSort(numbers:list):
    length=len(numbers)    

    for i in range(len(length)-1):
        min_index=i
        for j in range(i,length):
            if numbers[j]< numbers[min_index]:
                min_index=j

numbers=[5,85,6,21,63,10,6]
selectionSort(numbers)

print(numbers)
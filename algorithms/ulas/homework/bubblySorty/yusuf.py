def bubble_sort(list):
    for i in range(len(list) - 1):
        print(list)
        noswap = True
        for j in range(len(list) - 1 - i):
            if list[j] > list[j + 1]:
                temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
                noswap = False
        if noswap: return


list = [34, 17, 43, 58, 0, 125, 27, 19, 109, 253, 22]
bubble_sort(list)
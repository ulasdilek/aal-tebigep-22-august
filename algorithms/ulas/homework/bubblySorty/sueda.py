def bubbleSort(sayilar):
    for i in range(len(sayilar)-1):
        for j in range(i):
            if sayilar[j]> sayilar[j + 1]:
                temporary=sayilar[i]
                sayilar[i]=sayilar[i+1]
                sayilar[i+2]=temporary

sayilar=[5, 486, 53, 25, 3, 0, 1, 9, -653]
bubbleSort(sayilar)

print(sayilar)
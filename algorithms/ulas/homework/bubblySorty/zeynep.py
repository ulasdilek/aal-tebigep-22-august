def sort(numbers):
    for i in range(len(numbers)-1,0,-1):
        for j in range(i):
            if numbers[j]>numbers[j+1]:
               temp = numbers[j]
               numbers[j] = numbers[j+1]
               numbers[j+1] = temp
			   
numbers = [6, 3, 7, 5, 8, 2]
sort(numbers)
print(numbers) 

#-------------------------------------------------------------------O(N^2)
#worst case de bubble sort un complexity si O(Nˆ2) optimize halinde O(N) olmasi gerekiyor 
#baya arastirdim ama best case i nasil uygulayacagimi bilmiyorum:(



#selection sortun da best ve worst case complexity si ayni O(Nˆ2) 
#bunu da indian guylarin videolarindan ogrendim skdjskd
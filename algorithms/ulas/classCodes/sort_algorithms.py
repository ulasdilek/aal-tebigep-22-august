from random import randint


def swap(liste : list, index1 : int, index2 : int):
	temp = liste[index1]
	liste[index1] = liste[index2]
	liste[index2] = temp

def bubble_sort(liste : list):
	print(liste)

	for i in range(len(liste) - 1): # sondan kacinci elemani yerlestiriyorum
		noswap = True
		for j in range(len(liste) - 1 - i): # su an bastan kacinci elemani kontrol ediyorum
			# print ("j degeri:", j, "liste:", liste)
			if liste[j] > liste[j + 1]:
				swap(liste, j, j + 1) # eger buyuk olan eleman soldaysa yerlerini degistir
				noswap = False
		if noswap:
			return

	print(liste)

def selection_sort(liste : list):
	print(liste)

	for i in range(len(liste)): # for every i we find and place the i th smallest element
		min_index = i # we assign an initial value to the index of the minimun value
		for j in range(i, len(liste)): # starting from i, we iterate through the list to find the minimum
			if liste[j] < liste[min_index]: # if the current element is smaller than our minimum element, then the current element is the new minimum
				min_index = j
		swap(liste, i, min_index) # after finding the i th minimum element, we swap it with the element on the i th index 
	
	print(liste)

def quick_sort(liste : list, pivot : int, low : int, high : int):


	quick_sort(liste=liste, pivot=low, low=low, high=pivot - 1)
	quick_sort(liste=liste, pivot=pivot+1, low=pivot+1, high=high)


numbers = []
for i in range(1000000):
	numbers.append(randint(1, 1000000))

bubble_sort(numbers)
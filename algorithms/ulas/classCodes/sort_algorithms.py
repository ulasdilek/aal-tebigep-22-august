def swap(liste : list, index1 : int, index2 : int):
	temp = liste[index1]
	liste[index1] = liste[index2]
	liste[index2] = temp

def bubble_sort(liste : list):
	print(liste)

	for i in range(len(liste)): # sondan kacinci elemani yerlestiriyorum
		for j in range(len(liste) - 1): # su an bastan kacinci elemani kontrol ediyorum
			print ("j degeri:", j, "liste:", liste)
			if (liste[j] > liste[j + 1]):
				swap(liste, j, j + 1) # eger buyuk olan eleman soldaysa yerlerini degistir

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

numbers = [19, 53, 62, 26, 71, 87, 42, 93, 5, 11, 0, 6.28]

selection_sort(numbers)
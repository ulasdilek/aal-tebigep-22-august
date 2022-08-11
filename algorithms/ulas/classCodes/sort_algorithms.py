from random import randint

def swap(liste : list, index1 : int, index2 : int):
	temp = liste[index1]
	liste[index1] = liste[index2]
	liste[index2] = temp

def insert(liste : list, target : int, source : int):
	temp = liste[source]
	for i in range(source, target, -1):
		liste[i] = liste[i - 1]
	liste[target] = temp

def merge(liste1 : list, liste2 : list):
	index1 = 0
	index2 = 0
	result = []
	while index1 < len(liste1) and index2 < len(liste2):
		if liste1[index1] < liste2[index2]:
			result.append(liste1[index1])
			index1 += 1
		else:
			result.append(liste2[index2])
			index2 += 1
	if index1 == len(liste1):
		result += liste2[index2:]
	else:
		result += liste1[index1:]
	print ("liste1:", liste1, "liste2:", liste2, "result:", result)
	return result

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

def merge_sort(liste : list):
	# recursion
	liste = helper_merge_sort(liste, 0, len(liste) - 1)

def helper_merge_sort(liste : list, left : int, right : int):
	# base case
	if left == right:
		return [liste[left]] # return a new list with only one element

	# general case
	# divide
	middle = (left + right) // 2
	left_list = helper_merge_sort(liste, left, middle)
	right_list = helper_merge_sort(liste, middle + 1, right)

	# conquer
	return merge(left_list, right_list)

def quick_sort(liste : list):
	helper_quick_sort(liste=liste, pivot=0, low=0, high=len(liste))

def helper_quick_sort(liste : list, pivot : int, low : int, high : int):
	# base case
	if high - low <= 1: # length is at most 1
		return

	# general case
	# partition
	for i in range(low, high):
		
		if liste[i] < liste[pivot]:
			pivot += 1
			insert(liste=liste, target=low, source=i)
			# print(liste)

	# This reduces the complexity to O(N) for an already sorted sub-list
	# But this reduces the optimisation for the general case
	# *Optional* step provided by Mehmed Samed Sumer
	sorted = True
	for i in range(low, high - 1):
		if liste[i] > liste[i+1]:
			sorted = False
			break

	print(liste)

	if sorted:
		return

	helper_quick_sort(liste=liste, pivot=low, low=low, high=pivot)
	helper_quick_sort(liste=liste, pivot=pivot + 1, low=pivot + 1, high=high)

numbers = [4, 2, 3, 1, 5 ,6, 7, 8]
# for i in range(1000000):
# 	numbers.append(randint(1, 1000000))

print(numbers)
quick_sort(numbers)
print(numbers)
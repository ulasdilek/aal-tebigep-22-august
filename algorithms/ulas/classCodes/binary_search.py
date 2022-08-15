from random import randint
#from sort_algorithms import merge_sort

def binary_search(liste, target):
	left = 0
	right = len(liste) - 1
	while left <= right:
		middle = (left + right) // 2
		if liste[middle] == target:
			return middle
		elif liste[middle] > target:
			right = middle - 1
		else:
			left = middle + 1
	return -1 # listede yok


liste = [1, 4, 5, 7, 8, 10, 15, 16, 19]

size = 1000

# for i in range(size):
# 	liste.append(randint(1, 100000))

# merge_sort(liste)

# input hazir

for i in range(5):
	print(binary_search(liste, int(input())))
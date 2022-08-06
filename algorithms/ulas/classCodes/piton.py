# printing all possible subsets of length 2 of the set {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} in O(N^2) time complexity
for i in range(10): # 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
	for j in range(i + 1, 10):
		print (i, j)
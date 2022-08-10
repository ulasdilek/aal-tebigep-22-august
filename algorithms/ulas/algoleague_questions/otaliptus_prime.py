from math import sqrt


t = int(input())
nums = [int(x) for x in input().split()]

for num in nums:
	prime = True
	for div in range(2, int(sqrt(num)) + 1):
		if num % div == 0:
			print("No")
			prime = False
			break
	if prime:
		print("Yes")
N = 100 # upper limit

# O(N*log(log(N)))
isPrime = [True for i in range(N + 1)] # is the number at index prime?
# [False, False, True, True, False, ----]
# 	 0		1	   2	 3	   4
isPrime[0] = False
isPrime[1] = False
for i in range(2, N + 1):
	if isPrime[i]:
		for j in range(i * i, N + 1, i): # every multiple of i
			isPrime[j] = False

for num in range(N + 1):
	if isPrime[num]:
		print(num)
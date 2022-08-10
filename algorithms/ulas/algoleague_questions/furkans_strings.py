# Since we need a list to sort our input by character, remove and add characters, we use the "list(str)" method
a_list = list(input())
b_list = list(input())

a_list.sort()
b_list.sort()

# We now omit the match characters from both lists 
index_a = 0
index_b = 0
while index_a < len(a_list) and index_b < len(b_list):
	if b_list[index_b] == a_list[index_a]:
		a_list.pop(index_a)
		b_list.pop(index_b)
	elif b_list[index_b] > a_list[index_a]:
		index_a += 1
	else:
		index_b += 1

cost = len(b_list)*2 - len(a_list)
if cost < 0:
	cost = 0
print(cost)
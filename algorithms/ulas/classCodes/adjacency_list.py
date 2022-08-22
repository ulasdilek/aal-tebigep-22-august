N = int(input()) # number of vertices
E = int(input()) # number of edges

adj_list = [[] for i in range(N + 1)] # we want to use indices starting from 1
for i in range(E):
    x, y = [int(i) for i in input().split()]
    adj_list[x].append(y)
    adj_list[y].append(x)

print(adj_list)
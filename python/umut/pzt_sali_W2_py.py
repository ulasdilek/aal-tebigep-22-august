##break examples:
"""
summ = 0 
for i in range(5,11,2):
    summ = summ + i
    if(summ == 12):
        break
        summ = summ + 1 
print(summ)


for i in "abcdefg":
    if(i == "c"):
        print("cyi buldum")
        break
        print("gerçekten buldum")
"""
##String index revision
"""
text = "abcdefg"
print(text[3])
for i in range(0,len(text)):
    print(text[i])

"""
##Nested loop examples   
""" 
for i in range(0,4):
    for j in range(0,3):
        print("*",end = '')
    print()    
    

for i in range(1,4):
    for j in range(i):
        print("*",end = '')
    print()   


max_sıra = 10

for satir in range(1,max_sıra+1):
    for bosluk in range(1,(max_sıra-satir)+1):
        print(" ", end = '')
    for yildiz in range(1,satir*2):
        print("*",end = '')
    print()
"""

##Quiz break-nestedLoop
"""
s1 = "Bilkent u rock"
s2 = "i rule Bilkent"
if len(s1) == len(s2):
    for char1 in s1:
        for char2 in s2:
            if char1 == char2:
                print("common letter", char1)
                break
            
"""


##Nested loop examples
"""
for i in range(5,0,-1):
    for j in range(i,0,-1):
        print(j , end = '')
    print()    
"""
"""
for i in range(5,0,-1):
    ##print(i, end = '')
    
    for j in range(i,0,-1):
        print(i, end = '')
    print()
"""

##FUNCTIONS
"""

def is_even_short(x):
    return x % 2 == 0

def is_even(x):
    if(x % 2 == 0):
        return True
    else:
        return False

print(is_even_short(4))

print(is_even(7))

"""
"""
## Local - global variables
def f(x):
    x = x + 1
    print("in f(x): x = " , x)
    return x

z = f(x)

print(x)
print(z)
"""
"""
def g():
    x = 1
    print(x)
  
x = 5
z = g()
print(x)    
"""






            




















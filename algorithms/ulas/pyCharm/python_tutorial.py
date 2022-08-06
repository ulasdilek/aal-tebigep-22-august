# Any line that starts with "#" is a comment line and is ignored by the Python interpreter

"""
You can use three quotation marks to make a multi-line comment.
These are mostly used in documentations of Python libraries and programmes to
explain how a method or a class functions, or to give future programmers some
advice on what principles to follow while developing on the same piece of code
"""

# Variable names cannot include mathematical operators such as "-, +, *, /, =, >, <, ^"
il-legal = 1

# Variable names cannot start with numbers
1variable = 1

# But they can include numbers
variable1 = 1

# There are six main types of variables in Python:
dogru_yanlis = True # booleans
tam_sayi = 0 # integers
ondalikli_sayi = 3.14 # floats (decimal numbers)
karakter = 'a' # characters
string = "hello world" # strings
liste = [1, "string", False, 'c'] # lists

# These are the mathematical operators in Python:
a = 1 + 2   # = 3   | obviously, addition
b = 2 - 5   # = -3  | obviously, subtraction
c = 2 * 3   # = 6   | multiplication
d = 8 / 4   # = 2   | division
e = 5 ** 2  # = 25  | exponentiation
f = 35 % 8  # = 3   | modulus (birinci sayiyi ikinciye bolunce kalan sayi)

# There are logical operations in Python
bool0 = a == b          # = False   | equal to
bool1 = a != b          # = True    | not equal to
bool2 = a > b           # = True    | greater than
bool3 = b >= c          # = False   | greater than or equal to
bool4 = c < d           # = False   | less than
bool5 = d <= e          # = True    | less than or equal to
bool6 = bool2 and bool3 # = False    | logical and
bool7 = bool3 or bool4  # = False   | logical or
bool8 = not bool5       # = False   | logical not

# We can make use of booleans and logical operations in if branches with the structure:
if bool8:
    print("if you can see this, bool8 must be true")
elif bool7: # this means else if
    print("if you can see this, bool8 must be false and bool7 must be true")
elif bool6: # we can have more than one ifs or elifs and we can also have conditional branches nested inside conditional branches
    print("if you can see this, bool8 and bool7 must be false and bool6 must be true")
    if bool5 and bool4: # we can combine multiple booleans in our if condition.
        print("if you can see this, bool8 and bool7 must be false, and bool6, bool5 and bool4 must be true")
else: # the commands inside the else block run if and only if all conditions above this block are false
    print("none of the bools from 4 to 8 are true")
# You do not have to have an else or elif statement after an if statement. However, you must have an if statement before an else or elif statement.

# While: Run as long as the condition is satisfied
while a < e:
    # we can pass multiple parameters inside print function with a comma to print out multiple variables with a space between them
    print("i am inside the while loop. a =", a, " e =", e)
    a += 1 # this means a = a + 1
    while True: # loops can be nested as well
        print("this will run once for every a < e")
        break # we can use the break command to exit the most recently entered loop
print("i am outside of the while loop")

"""
For: In python, there are two ways to create a loop: using while loop or for loop.
for loops have the following structure : 
for _counter_ in range(_how_many_times_):
    _____
    _____
range() creates a list that is made of consecutive numbers from 0 to how_many_times_, last one is not included.
_counter_ is a variable and takes values from range()
"""
print("This is the first range:")
for i in range(10):
    # this code piece will be executed again and again, but in every iteration, i will be set to next value in the range(10).
    print("it's the " + str(i+1) + "th iteration now and the value of i is " + str(i))

# It's possible to skip some iterations or stop the loop completely. To do these, we use continue and break keywords.
print("\nThis is the second range:")
for i in range(10):
    if (i == 2):
        # When this condition is true, lines below the code will no more be executed. for loop will continue with next iteration.
        continue
    if (i == 5):
        # When this condition is true, lines below the code will no more be executed and it will exit from the for loop.
        # It will stop printing numbers
        break
    print("it's the " + str(i+1) + "th iteration now")

# in Python, variables know their types (whether they are integers, strings or anything else)
# we can take advantage of that in our for loops as well
print("\nThis is the list of stuff:")
list_of_stuff = ["abcd", "efgh", "ijkl", "mnop", "qrst", "uvwx", "yz", 10, 15, True, '*', ["another list", "because", "lists can contatin lists"]]
for i in list_of_stuff:
  print(i)

# METHODS: Methods help us execute some part of the code without writing it multiple times. They are also called functions.
# (Actually there's a difference but not so important in this course.)
def method():
    print("this part will be executed whenever this method is called")
method() # this is how you call a function

# Methods can take parameters
def method(param1, param2):
    print("this is the value of param1", param1)
    print("this is the value of param2", param2)

# This is how you pass arguments to your function. The arguments you pass are assigned to the parameters of the function.
method(1, 2) # They allow your functions to be more dynamic and general

# Some methods can return values, in order to do this we use return keyword
# Here's a simple method that takes two parameters and return their sums. When sum()'s called, it will carry the sum of its parameters.
def sum(a, b):
    return a + b

print("when you add 2 and 3, you get", sum(2,3)) # Calling sum(2,3) is the same as writing 2 + 3 because this specific function will return that value.
# Important Note: return keyword acts like the break keyword used in for/while loops. Codes below return keyword will not be executed because it will exit the function.

def new_sum(a, b):
    return a + b
    print("This code wil not be executed because it's after return")

print("Calling new_sum...", new_sum(5, -3))

# RECURSION: We previously defined some methods. Recursion is the idea to use the same method in its definition.

# The following code will print numbers from the given argument to 1. Each method prints its num and leave the rest of the work to another method.

def print_from_this_to_1(num):
    # If this number is eqaul to 1, then I will no longer print numbers and exit the method. This is called the "BASE CASE"
    if (num == 1):
        print(1)
        return  # We exit the method

    # Else, I will print this number and then call print_this(num-1). This is called the "GENERAL CASE".
    # It defines how the function will act until it reaches the special case that will make it stop
    print(num)
    print_from_this_to_1(num - 1)


print_from_this_to_1(10)
# Just like infinite while loops, recursion can be infinite as well. We need to avoid a function calling itself infinitely many times since unlike
# a while loop, calling functions use up a small portion of the available memory, named the "Call Stack".
# If a function calls itself too many times, the system stops the program to stop you from using up all the memory and breaking the computer.
def to_infinity_and_beyond(x):
  # A badly designed recursive function will call itself infinitely. Always pay attention to your base and general cases!
  # Can you point out what the mistake with the logic of this function is?
  if (x < 0):
    return
  else:
    to_infinity_and_beyond(x + 1)

print("---> Just before calling the function")
to_infinity_and_beyond(0)
print("---> You will not see this in the output")

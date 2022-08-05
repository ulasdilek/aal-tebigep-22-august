#print function
print("Hello World!")
print("Hello World!")

#\n
print("Hello World!\nHello World!")

#.format
print("{} {}".format("Hello", "World!"))

#print(f)
name = "umut"
year = 134
print(f'name: {name:10s} and year: {year:10d}')

salary = 87650.237

print(f'Your salary is {salary:10.2f}')

#how to make comments #, """-"""

##data types
number = 5

number2 = 4

number3 = 3.0

number4 = 4.786658645745


control = True

control2 = False

text = "umut"

# Typecasting
number5 = float(number)

number2 = number5

print(number2)


## Operators
x = 12 / 5
print(x)

x = 12 // 5
print(x)

x = 10 / 4.0
print(x)

x = 10 // 4.0
print(x)

x = 4 / 10
print(x)

x = 4 // 10
print(x)

x = 12 % 3
print(x)

x = 10 % 3
print(x)

x = 3 % 10
print(x)

x += 5
print(x)

x **= 2
print(x)

x *= 10
print(x)

# Strings (some functions and slicing)
print(len("abc"))

s = "abcdefgh"
S = s.upper()
sCap = s.capitalize()
sRep = s.replace("a","b") 

print(S)
print(sCap)
print(sRep)

print(s[0])
print(s[-3])
print(s[0:len(s):2])
print(s[::-1])  ## reversed
print(s[4:1:-2])


u1 = "umut"

u2 = "Umut"

u3 = u1 + u2*3

print(u3)
#input()

name = input("Enter your name: ")
age = int(input("Enter your age: "))
height = float(input("Enter your height: "))
print(f'Your name is {name:5s}, you are {age:d} years old and your height is {height:.2f}')

##Exercise 1
pi = 3.14
radius = 1.5
area = pi * radius ** 2
perimeter = 2 * radius * pi
# display raw area and perimeter (without formatting)
print('Area:', area, 'Perimeter:', perimeter)
# display area and perimeter by formatting the numbers
print(f'Area: {area:100.40f} Perimeter: {perimeter:.20f}')

##Exercise 2
k = 400
c = k - 273.15
# display result without formatting the output
print(k, 'degrees K is', c, 'degrees C')
# another way to do it
print(str(k) + ' degrees K is' + str(c) + ' degrees C')
# display by formatting the output
print(f'{k:d} Degrees K is {c:.2f} degrees C')

##Exercise 3
num = 3715
first = num // 1000
last = num % 10
digit_sum = first + last
print('The sum of', first, 'and', last, 'is', digit_sum)
print(f'The sum of {first} and {last:d} is {digit_sum:d}')

##Exercise 4
distance = 500
velocity = 110
hours = distance // velocity
minutes = (distance / velocity - hours) * 60
print('It will take', hours, 'and', minutes, 'minutes to travel', distance, 
      'kms at a speed of', velocity, 'km/h')
print(f'It will take {hours} hours and {minutes:.2f} minutes to travel {distance} kms \
at a speed of {velocity} km/h')


#Exercise 5
birincigün = 236523593590328

deneme1 = birincigün % 10
print(deneme1)
deneme2 = birincigün / 10
print(deneme2)
deneme3 = birincigün // 10
print(deneme3)

deneme4 = int(234234.1232132132)
print(deneme4)


# ord() returns an integer representing the Unicode character.
print(ord('a')) #97
# chr() returns a unicode character of the corresponding integer argument 
print(chr(53666)) # 톢
print(chr(97)) #a



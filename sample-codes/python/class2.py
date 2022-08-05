import random

"""
if ("u" in "umut"):
    print("yes")
else:
    print("no")
    
if ("a" not in "umut"):
    print("no a")
else:
    print("there is a 'a'.")
"""

"""
# A program that calculates letter grade

grade = int(input("Lütfen notunuzu giriniz: "))

harf_notu = "KONTROL"

if(grade >= 95):
    harf_notu = "A+"
elif(grade >= 85 and grade<95):
    harf_notu = "A"
elif(grade >= 75 and grade<85):
    harf_notu = "B+"
else:
    harf_notu = "ATILDIN"    
print("harf notun: " + harf_notu)    

"""


"""
#Guessing game with only one hit
number = random.randint(0,10)
tahmin = int(input("Sayı giriniz sıfır ve on arasında : " ))

if(number is tahmin ):
    print("Tahmin doğru")
else:
    print("Kaybettin")
    print(number)
"""



"""
#Guessing game with guess limit
number = random.randint(0, 10)
tahmin = int(input("sayı giriniz sıfır ve on(dahil) arasında : " ))

counter = 1 

limit = 3
while number != tahmin and counter<=limit:
    print("Bilemedin")
    tahmin = int(input("Bir daha dene : " ))
    counter = counter + 1
    
if(counter == 4):
    print("hakkın doldu yandın")
else:
    print("Kazandınız")

"""




"""
# A program that calculates required days and hours to reach 1000000 population for germs

initial_pop = int(input("Başlangıç populasyonunu giriniz: "))

time  = int(input("Katlanma için zaman limiti girelim: "))

a = int(input("Katlanma kat sayısı girelim: "))

hours = 0 

while initial_pop <= 1000000:
    hours = hours + time
    initial_pop = initial_pop * a
    
days = hours // 24

hours = hours % 24


print(f'days:{days:10d} hours:{hours:10d}  population:{initial_pop:10d}') 
    
"""




"""
# A program that calculates average of numbers 
summ = 0

counter = 0

number = int(input("Sayı giriniz: "))

average = 0

while number >= 0:
    summ = summ + number
    counter = counter + 1
    number = int(input("Sayı giriniz:(Çıkmak istiyorsan negatif) "))
    
if(counter>0):
    average = summ / counter 
    print(average)
else:
    print("No values")
"""






























































































    
    















    
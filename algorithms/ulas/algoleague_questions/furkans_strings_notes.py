# This file is just an explanation of our approach to the problem
# This is not a python code
# You can find the full question here:
# https://algoleague.com/contest/monthly-contest-6/problem/furkans-strings/detail

# a -> b
# free character ordering
# +1 coin for selling a character
# -2 coins for buying a character

# what do we need?
# We need to be able to sort, remove and add.
# So we may use a "list" as a data structure

a = "ababa"  # 10^5
b = "bacacd" # 10^5

"""
1- Omit the part that is the same.
2- Buy or sell characters efficiently
"""

"ababa" = "aaabb"

# part 1 

# iki stringi de sortlayalim O(N*log(N))
a = "aaabb"
b = "aabccd"

# b stringindeki her bir karakter icin a da olup olmadigini kontrol edelim.
# Eger var ise, iki stringden de kaldiralim, yoksa mantikli bir sekilde kontrol etmeye devam edelim.
# Iki stringden birinin sonuna erisirsek bitirelim O(N)
"aaabb" -> "ab"
"aabccd" -> "ccd"

# part 2

a = "ab" # a daki butun karakterleri sat : elime a nin uzunlugu*1 kadar para gecti
b = "ccd" # ve b deki karakter sayisi kadar karakter satin al : elimden b nin uzunlugu*2 kadar para cikti

# beklenen yanit: 4

# it turns out that negative cost is invalid. We can just slam another if at the end to solve this issue
cost = len(b)*2 - len(a)*1 # O(1): constant
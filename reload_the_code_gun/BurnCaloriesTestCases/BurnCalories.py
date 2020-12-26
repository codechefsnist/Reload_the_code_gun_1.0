"""
Dairy milk (D)
238
Twix (T)
244
Milky Bar (M)
138
Bounty (B)
279
Crunchie (C)
186

"""

n = input()
s = 0
for i in n:
    if i == 'D':
        s += 238
    elif i == 'T':
        s += 244
    elif i == 'M':
        s += 138
    elif i == 'B':
        s += 279
    else:
        s += 186
        
temp = int((s - (s % 50))/50)
print(temp)
s -= (s - (s % 50))
temp = int((s - (s % 5))/5)
print(temp)
s -= (s - (s % 5))
temp = int((s - (s % 0.5))/0.5)
print(temp)
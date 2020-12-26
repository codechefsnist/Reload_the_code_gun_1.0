n=int(input())
m=str(n)
c=0
for i in m:
    if(int(i)!=0 and n%int(i)==0):
        c+=1
print(c)





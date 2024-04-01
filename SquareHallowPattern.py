row=int(input())
temp=row
while (temp>0):
    print("*",end="  ")
    temp-=1



for i in range(1,row-1):
    print("\n*",end="  ")
    flag=row-2
    while flag>0:
        print(" ",end="  ")
        flag-=1
    print("*",end=" ")

print()
for i in range(1,row+1):
    print("*",end="  ")
    row-=1
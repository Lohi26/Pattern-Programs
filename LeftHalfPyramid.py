n=int(input())
k=1
x=n-1
for i in range(1,n):
    flag=x
    while flag>0:
        print(" ",end=" ")
        flag-=1
    x-=1
    temp=k
    while temp>0:
        print("* ",end=" ")
        temp-=1
    k+=1
    print("\n")
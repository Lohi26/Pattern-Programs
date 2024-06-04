n=int(input())
row=n
column=(n*2)-1
k=n-1
x=1
y=1
count=1
for i in range(1,n+1):
    temp=k
    while temp>0:
        print("",end=" ")
        temp-=1
    dummy=y
    while dummy>0:
        print(count,end=" ")
        dummy-=1
    k-=1
    y+=1
    count+=1
    print()
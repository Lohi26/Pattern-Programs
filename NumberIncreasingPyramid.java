n=int(input())
k=1
for i in range(1,n+1):
    temp=k
    while temp>0:
        print(k,end=" ")
        temp-=1
    k+=1
    
    print()

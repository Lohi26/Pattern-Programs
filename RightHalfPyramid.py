n = int(input())
k=1
for i in range(1,n):
    temp=k
    while(temp>0):
        print("* ", end="")
        temp-=1
    print("\n")
    k+=1

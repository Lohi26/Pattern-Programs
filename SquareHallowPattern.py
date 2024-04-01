row=int(input())
column=int(input())
temp=row
while temp>0:
    print("* ",end=" ")
    temp-=1
for i in range(1,column-2):
    print("* ",end=" ")
while row>0:
    print("* ",end=" ")
    row-=1

T=int(input())
li=[]
for i in range(T):
    n=int(input())
    li.append(n)
li.sort()
for i in range(T):
    print(li[i])
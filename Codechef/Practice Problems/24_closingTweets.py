(N,K)=map(int,input().split())
dict1={x:0 for x in range(1,N+1)}
for i in range(1,K+1):
    string=input()
    if string=='CLOSEALL':
        dict1={x:0 for x in range(1,N+1)}
    else:
        num=int(string[6:])
        if dict1[num]==0:
            dict1[num]=1
        else:
            dict1[num]=0
    print(sum(dict1.values()))

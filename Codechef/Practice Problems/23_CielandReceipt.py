prices=[2048,1024,512,256,128,64,32,16,8,4,2,1]

for _ in range(int(input())):
    p=int(input())
    cnt=0
    i=0
    while True:
        #print('p:',p)
        if p==0:
            break
        elif p%prices[i]==0:
            cnt+=p//prices[i]
            p=0
        else:
            cnt+=p//prices[i]
            p=p%prices[i]
        i+=1
    print(cnt)

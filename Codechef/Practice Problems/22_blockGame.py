def palindrome(x):
    
    
    for i in range(len(x)):
        if x[i]==x[-1-i]:
            checker=1
            
            
        else:
            checker=0
            break
            
    if checker==1:
        print("wins")
    if checker==0:
        print("loses")
t=int(input())
a=[]
for j in range(t):
    a=list(map(int,input()))
    palindrome(a)
    
    a.clear()
    j+=1

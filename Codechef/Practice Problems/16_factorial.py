import math
t=int(input())
while(t!=0):
    n=int(input())
    if(n==0):
        print("1")
    else:    
        print(math.factorial(n))
    t=t-1  
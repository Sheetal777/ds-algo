for t in range(int(input())):
    a,b = map(int,input().split())
    
    if a > b :
        print(a ,a+b)
    else:
        print(b ,a+b)

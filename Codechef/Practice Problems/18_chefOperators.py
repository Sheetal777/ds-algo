for t in range(int(input())):
    a,b = map(int,input().split())
    
    if a > b :
        print(">")
    elif a < b :
        print("<")
    elif a == b :
        print("=")

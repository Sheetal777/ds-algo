withdraw,balance = map(float,input().split())

#withdraw,balance = [float(item) for item in read]

if (withdraw%5 != 0) :
    print (balance)
elif (balance < withdraw +0.5) :
    print (balance)
else :
    print(balance-(withdraw+0.5))
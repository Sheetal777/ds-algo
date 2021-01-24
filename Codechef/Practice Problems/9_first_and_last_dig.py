t=int(input())
for i in range(t):
    num=int(input())
    sum=int(num%10)
    while(num>=10):
        num=int(num/10)
    sum+=num
    print(sum)
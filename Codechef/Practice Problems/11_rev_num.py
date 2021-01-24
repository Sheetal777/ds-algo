def digits(a):
	count = 0
	while(a>=1):
		a/=10
		count+=1
	return count
t= int(input())
for j in range(t):
	n=int(input())
	list1=[]
	result=0
	for i in range(digits(n)):
		list1.append(int(n%10))
		n=n-n%10
		n/=10

	for i in range(len(list1)):
		a=len(list1)-i-1
		result+=int(list1[i]*(10**(a)))
	print(result)
N = int(input())
l = 0
w = 0
t1 = 0
t2 = 0
for _ in range(N):
    m, n = map(int, input().split())
    t1 += m
    t2 += n
    if(abs(t1 - t2) > l):
        l = abs(t1-t2)
        if(m>n):
            w = 1
        else:
            w = 2
print(w,l)      
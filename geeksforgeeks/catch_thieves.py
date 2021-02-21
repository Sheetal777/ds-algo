class Solution:
    def catchThieves(self, arr, n, k): 
        # code here 
        i = 0
        l = 0
        r = 0
        res = 0
        thieves = []
        police = []
        
        while i < n :
            if arr[i] == 'P':
                police.append(i)
            elif arr[i] == 'T' :
                thieves.append(i)
            i += 1
            
        while l < len(thieves) and r < len(police):
            
            if (abs(thieves[l] - police[r]) <= k):
                res += 1
                l += 1
                r += 1
                
            elif thieves[l] < police[r]:
                l += 1
            else :
                r += 1
                
        return res


#{ 
#Driver Code Starts.

if __name__=='__main__': 
    t = int(input())
    for _ in range(t):
        line1 = list(map(int, input().strip().split()))
        n = line1[0]
        k = line1[1]
        arr = list(input().strip().split())
        obj = Solution()
        print(obj.catchThieves(arr, n, k))


#} Driver Code Ends

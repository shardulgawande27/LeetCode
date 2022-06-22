class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        
        # Solution 1 with time: O(n) and space: O(1)
#         l, r = 0 , len(s) - 1
#         while l < r:
#             s[l], s[r] = s[r] , s[l]
#             l, r = l + 1, r - 1 
    
        
        # Solution 2
        stack = []
        for c in s:
            stack.append(c)
            
        i = 0
        while stack:
            s[i] = stack.pop()
            i += 1
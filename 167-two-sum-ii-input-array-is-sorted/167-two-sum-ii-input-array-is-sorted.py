class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        
        l , r = 0 , len(numbers) - 1
        
        while l < r :
            
            currNum = numbers[l] + numbers[r]
            
            if currNum > target:
                r -=1
                
            elif currNum < target:
                l += 1
            
            else:
                return [l + 1, r + 1]
                
        return[]
                
        
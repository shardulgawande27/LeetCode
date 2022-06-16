class Solution:
    def isPalindrome(self, x: int) -> bool:
        
        if (x < 10 and x >= 0):
            return True
        
        if (x<10 or (x%10==0 and x!=0)):
            return False
    
        rev = 0 
        while (x>rev):
            last_digit = x % 10
            rev = rev * 10 + last_digit
            x = x//10
            
        if (x == rev or x== rev//10):
            return True
            
            
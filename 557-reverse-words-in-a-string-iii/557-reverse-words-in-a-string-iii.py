class Solution:
    def reverseWords(self, s: str) -> str:
        
#         One liner
        # return " ".join([i[::-1] for i in s.split(' ')])

#         For better understanding 
        
        words = s.split()
        
        reversed_words = []
        for word in words:
            reversed_words.append(word[::-1])
        
        return " ".join(reversed_words)

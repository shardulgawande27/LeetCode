class Solution {
//     public List<Integer> findSubstring(String s, String[] words) {
        
//         List<Integer> ans = new ArrayList<Integer>();
        
//         int len = words[0].length();
        
//         Map<String, Integer> map = new HashMap<String  ,Integer>();
        
//         for(String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
        
//         for(int i = 0; i<= s.length() - len * words.length; i++){
            
//             Map<String, Integer> copyMap = new HashMap<String, Integer>(map);
            
//             for(int j =0; j < words.length; j++){
//                 String str = s.substring(i + j*len, i + j*len + len);
                
//                 if(copyMap.containsKey(str)){
//                     int count = copyMap.get(str);
//                     if(count == 1) copyMap.remove(str);
//                     else copyMap.put(str, count - 1);
                    
//                     if(copyMap.isEmpty()){
//                         ans.add(i);
//                         break;
//                     }
                    
//                     else{break;}
//                 }
//             }
            
//         }
//         return ans;
        
        
//     }
    
    private HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
    private int wordLength;
    private int substringSize;
    private int k;
    
    private boolean check(int i, String s) {
        // Copy the original dictionary to use for this index
        HashMap<String, Integer> remaining = new HashMap<>(wordCount);
        int wordsUsed = 0;
        
        // Each iteration will check for a match in words
        for (int j = i; j < i + substringSize; j += wordLength) {
            String sub = s.substring(j, j + wordLength);
            if (remaining.getOrDefault(sub, 0) != 0) {
                remaining.put(sub, remaining.get(sub) - 1);
                wordsUsed++;
            } else {
                break;
            }
        }
        return wordsUsed == k;
    }
    
    public List<Integer> findSubstring(String s, String[] words) {
        int n = s.length();
        k = words.length;
        wordLength = words[0].length();
        substringSize = wordLength * k;
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n - substringSize + 1; i++) {
            if (check(i, s)) {
                answer.add(i);
            }
        }
        return answer;
    }
}
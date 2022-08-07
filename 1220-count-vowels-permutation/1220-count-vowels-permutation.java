class Solution {
    
    HashMap<String, Long> dp = new HashMap<>();
    
    long solve(int n, char c) {
        if(dp.containsKey(n+","+c)) return dp.get(n+","+c);
        if(n == 1) {
            return 1;
        }
        long res;
        if(c == 'a') {
            res = (solve(n - 1, 'e')) % 1_000_000_007;
        } else if(c == 'e') {
            res = (solve(n - 1, 'a') + solve(n - 1, 'i')) % 1_000_000_007;
        } else if(c == 'i') {
            res = (solve(n - 1, 'e') + solve(n - 1, 'o') + solve(n - 1, 'u') + solve(n - 1, 'a')) % 1_000_000_007;
        } else if(c == 'o') {
            res = (solve(n - 1, 'i') + solve(n - 1, 'u')) % 1_000_000_007;
        } else {
            res = (solve(n - 1, 'a')) % 1_000_000_007;
        }
        dp.put(n+","+c, res);
        return res;
    }
    
    
    public int countVowelPermutation(int n) {
        
        
        long a = solve(n, 'a');
        long i = solve(n, 'i');
        long u = solve(n, 'u');
        long e = solve(n, 'e');
        long o = solve(n, 'o');
 
        return (int)((a + i + u + e + o) % 1_000_000_007);
    }
        
        
}

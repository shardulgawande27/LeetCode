class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0 ; i< nums.length ; i++){
            if(uniques.contains(nums[i]))
            {
                return true;
            }
            uniques.add(nums[i]);
        }
        
        return false;
        
        
        
    }
}

// python 3 code
//   class Solution:
//     def containsDuplicate(self, nums: List[int]) -> bool:
//         hashset = set()
        
//         for n in nums:
//             if n in hashset:
//                 return True
//             hashset.add(n)
//         return False
class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> mp = new HashMap<>();
        int sz = nums.length;
        
        for (int i = 0; i < sz; i++) {
            int cur = nums[i];
            int need = target - cur;
            
            if (mp.containsKey(need)) {
                return new int[]{mp.get(need), i};
            }
            
            mp.put(cur, i);
        }
        
       
        return new int[]{};
    }
}

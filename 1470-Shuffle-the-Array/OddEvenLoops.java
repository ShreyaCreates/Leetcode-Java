class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        
        // Loop 1: Place all the X elements into even positions
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
        }
        
        // Loop 2: Place all the Y elements into odd positions
        for (int i = 0; i < n; i++) {
            ans[(2 * i) + 1] = nums[i + n];
        }
        
        return ans;
    }
}

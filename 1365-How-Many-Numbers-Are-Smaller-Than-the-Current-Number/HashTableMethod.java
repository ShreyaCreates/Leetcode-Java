class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countBucket = new int[102];
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            countBucket[nums[i]]++;
        }
        for (int i = 1; i <= 100; i++) {
            countBucket[i] += countBucket[i - 1];
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                ans[i] = 0;
            } else {
                ans[i] = countBucket[nums[i] - 1];
            }
        }
        return ans;
    }
}

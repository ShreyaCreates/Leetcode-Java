import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> notebook = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int neededNumber = target - nums[i];

            if (notebook.containsKey(neededNumber)) {
                return new int[] { notebook.get(neededNumber), i };
            }
            notebook.put(nums[i], i);
        }
        return new int[] {};
    }
}

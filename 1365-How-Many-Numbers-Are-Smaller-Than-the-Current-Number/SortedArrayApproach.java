import java.util.Arrays;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] sortedNums= nums.clone();
        Arrays.sort(sortedNums);
        for(int i=0;i<n;i++){
            int currentNumber=nums[i];
            for(int j=0;j<n;j++){
                    if(sortedNums[j]==currentNumber){
                        ans[i]=j;
                        break;
                    }
                }
            }
        return ans;
    }
}

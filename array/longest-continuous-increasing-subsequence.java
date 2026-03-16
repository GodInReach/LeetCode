class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int now = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                max++;
            }
            max = Math.max(now,max);
        }
        return max;

    }
}
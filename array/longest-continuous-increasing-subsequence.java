class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int now = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                now++;
            }
            else{
                now = 1;
            }
            max = Math.max(now,max);
        }
        return max;

    }
}
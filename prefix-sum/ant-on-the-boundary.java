class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int[] preSum = new int[nums.length+1];
        for(int i = 1; i<=nums.length; i++){
            preSum[i]=preSum[i-1]+nums[i-1];
            if(preSum[i]==0){
                count++;
            }
        }
        return count;
    }
}
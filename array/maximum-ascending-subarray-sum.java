class Solution {
    public int maxAscendingSum(int[] nums) {
        int csum = nums[0];
        int maxx = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                csum+=nums[i];
            }
            else{
                csum=nums[i];
            }
            maxx = Math.max(maxx,csum);
        }
        return maxx;
    }
}
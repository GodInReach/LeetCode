class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left = 0;
        int total = 0;
        for (int i : nums){
            total+=i;
        }
        for(int i = 0; i<nums.length; i++){
            int temp = (left-(total-left-nums[i]));
            left+=nums[i];
            nums[i] = Math.abs(temp);
        }
        return nums;
    }
}
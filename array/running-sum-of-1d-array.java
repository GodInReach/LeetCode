class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int tempsum = 0;
        for(int i = 0; i<nums.length; i++){
            tempsum+=nums[i];
            arr[i]=tempsum;
        }
        return arr;
    }
}
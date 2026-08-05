class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int rem = nums.length-k;
        int[] arr = new int[nums.length];
        for(int i = rem; i<nums.length; i++){
            arr[i-rem]=nums[i];
        }
        for(int i = 0; i<rem; i++){
            arr[k+i]=nums[i];
        }
        for(int i = 0; i<nums.length; i++){
            nums[i]=arr[i];
        }
    }
}
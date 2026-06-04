class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] rev = new int[nums.length*2];
        for(int i = 0; i<nums.length; i++){
            rev[i]=nums[i];
            rev[(nums.length*2-1)-i]=nums[i];
        }
        return rev;
    }
}
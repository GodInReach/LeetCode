class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        for(int i : nums){
            count ^= i;
        }
        return count;
    }
}
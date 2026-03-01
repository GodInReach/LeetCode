class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] op = new int[nums.length];
        for(int i = 0; i+1<nums.length; i++){
            op[i]=nums[i+1];
            op[i+1]=nums[i];
            i++;
        }
        return op;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        int[] visit = new int[201];
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(visit[nums[i]+100]!=0){
                nums[i]=101;
                count++;
            }
            visit[nums[i]+100]++;
        }
        Arrays.sort(nums);
        return nums.length-count;
    }
}

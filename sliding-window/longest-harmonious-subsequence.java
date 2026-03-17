class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int maxx = 0;
        if(nums.length==1 || nums[0]==nums[nums.length-1]){
            return 0;
        }
        int j = 0;
        for (int i = 1; i<nums.length; i++){
            if(nums[i]-nums[j]==1){
                count++;
                maxx++;
            }
            else{
                maxx=Math.max(count,maxx);
                count=0;
                j++;
            }
        }
        return maxx+1;
    }
}
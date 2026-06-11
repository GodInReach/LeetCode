class Solution {
    public int findMaxLength(int[] nums) {
        Map <Integer,Integer> mp = new HashMap<>();
        int count = 0;
        int maxl = 0;
        mp.put(0,-1);
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                count++;
            }
            else{
                count--;
            }
            if(mp.containsKey(count)){
                maxl = Math.max(maxl,i-mp.get(count));
            }
            else{
                mp.put(count,i);
            }
        }
        return maxl;
    }
}
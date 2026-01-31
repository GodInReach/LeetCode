class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1){return nums[0];}
        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i : nums){
            mp.merge(i,1,Integer::sum);
        }
        int key = nums[0];
        int mx = 0;
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            if(mx < e.getValue()){
                key = e.getKey();
                mx = e.getValue();
            }
        }
        return key;
    }
}
class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> st = new HashSet<Integer>();
        for(int i : nums){
            if(st.contains(i)){
                return i;
            }
            st.add(i);
        }
        return 0;
    }
}
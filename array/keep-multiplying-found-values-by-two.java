class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> st = new HashSet<Integer>();
        for (int i : nums){
            st.add(i);
        }
        while(true){
            if(st.contains(original)){
                original*=2;
            }
            else{
                return original;
            }
        }
    }
}
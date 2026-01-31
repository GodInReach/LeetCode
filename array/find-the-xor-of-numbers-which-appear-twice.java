class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xored = 0;
        Set<Integer> st = new HashSet<Integer>();
        for(int i : nums){
            if(! st.contains(i)){
                st.add(i);
            }
            else{
                xored^=i;
            }
        }
        return xored;
    }
}
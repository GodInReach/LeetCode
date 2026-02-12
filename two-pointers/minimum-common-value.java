class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int mi = Integer.MAX_VALUE;
        Set<Integer> snum2 = new HashSet<Integer>();
        for(int i : nums2){
            snum2.add(i);
        }
        for(int i : nums1){
            if(snum2.contains(i) && mi>i){
                mi = i;
            }
        }
        if(mi == Integer.MAX_VALUE){
            return -1;
        }
        return mi;
    }
}
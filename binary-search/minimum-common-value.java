class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int mi = Integer.MAX_VALUE;
        for(int i : nums1){
            for(int j : nums2){
                if(i==j && mi>i){
                    mi = i;
                }
            }
        }
        return mi;
    }
}
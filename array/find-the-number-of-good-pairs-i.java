class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int i = 0;
        int j = 0;
        int good = 0;
        while(i<nums1.length){
            for(j=0; j<nums2.length; j++){
                if(nums1[i]%(nums2[j]*k)==0){
                    good+=1;
                }
            }
            i++;
        }
        return good;
    }
}
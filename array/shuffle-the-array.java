class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[len-n];
        for (int i=0; i<len; i++){
            if(i<n){
                arr1[i]=nums[i];
            }
            else{
                arr2[i-n]=nums[i];
            }
        }
        int c1 = 0;
        int c2 = 0;
        for(int i =0; i<len; i++){
            if(i%2==0){
                nums[i]=arr1[c1];
                c1++;
            }
            else{
                nums[i]=arr2[c2];
                c2++;
            }
        }
        return nums;
    }
}
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int[] check = new int[nums.length];
        int done = 0;
        for (int i = 0; i<nums.length && done < 2; i++){
            if(check[nums[i]]==0){
                check[nums[i]]++;
            }
            else{
                arr[done]=nums[i];
                done++;
            }
        }
        return arr;
    }
}
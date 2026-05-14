class Solution {
    public boolean isGood(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i : nums){
            if(i<nums.length && arr[i-1]==0){
                arr[i-1]=1;
            }
            else if(i>=nums.length){
                return false;
            }
            else{
                if(i!=nums.length-1){
                    return false;
                }
                else{
                    if(arr[i]==0){
                        arr[i]=1;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(arr[nums.length-1]!=0){
            return true;
        }
        return false;
    }
}
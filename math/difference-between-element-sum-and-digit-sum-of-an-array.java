class Solution {
    public int differenceOfSum(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        for(int i : nums){
            c1+=i;
            while(i!=0){
                c2+=i%10;
                i/=10;
            }
        }
        return Math.abs(c1-c2);
    }
}
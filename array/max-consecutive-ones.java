class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int streak = 0;
        int last=0;
        int max = 0;
        int start =0;
        for (int i:nums){
            if (i==0 && start==0){
                continue;
            }
            else {start = 1;}
            if (max==0){
                streak=1;
                last=i;
                max=1;
            }
            else if (last==i){
                streak++;
                if (streak > max){
                    max = streak;
                };
            }
            else{
                streak = 0;
            }
        }

        return max;
    }
}
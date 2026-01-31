class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        int count = 0;
        int tempsum = 0;
        for(int i : nums){sum+=i;}
        for(int i : nums){
            tempsum+=i;
            if((tempsum-(sum-tempsum))%2==0){
                count++;
            }
        }
        if(count!=0){return count-1;}
        return count;
    }
}
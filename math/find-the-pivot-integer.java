class Solution {
    public int pivotInteger(int n) {
        int[] preSum = new int[n+1];
        for(int i = 1; i<=n; i++){
            preSum[i]=preSum[i-1]+i;
        }
        for(int i = 1; i<=n; i++){
            if(preSum[i-1]==(preSum[n]-preSum[i])){
                return i;
            }
        }
        return -1;
    }
}
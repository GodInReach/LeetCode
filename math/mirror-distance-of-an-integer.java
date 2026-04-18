class Solution {
    public int mirrorDistance(int n) {
        int i = n;
        int j = 0;
        while(i!=0){
            j=(j*10)+(i%10);
            i/=10;
        }
        return Math.abs(n-j);
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int mx = Integer.MIN_VALUE;
        for(int[] i : accounts){
            int temp = 0;
            for(int j : i){
                temp+=j;
            }
            if(mx<temp){
                mx=temp;
            }
        }
        return mx;
    }
}
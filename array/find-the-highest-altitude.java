class Solution {
    public int largestAltitude(int[] gain) {
        int[] alti = new int[gain.length+1];
        int maxi = 0;
        for(int i = 1; i<gain.length; i++){
            alti[i]=alti[i-1]+gain[i-1];
            if(alti[i]>maxi){
                maxi=alti[i];
            }
        }

        return maxi;
    }
}
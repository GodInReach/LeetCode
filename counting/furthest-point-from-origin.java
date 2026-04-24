class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;
        int u = 0;
        for (int i = 0; i<=moves.length()-1; i++){
            if(moves.charAt(i)=='L'){
                l++;
            }
            else if(moves.charAt(i)=='R'){
                r++;
            }
            else{
                u++;
            }
        }
        return Math.abs(l-r+u);
    }
}
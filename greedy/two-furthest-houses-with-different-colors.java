class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int j=colors.length-1;
        int maxx=0;
        while (i!=colors.length-1){
            if(i==j){
                i++;
                j=colors.length-1;
            }
            else if(colors[i]!=colors[j]){
                maxx=Math.max(maxx,Math.abs(i-j));
                i++;
                j=colors.length-1;
            }
            else if(colors[i]==colors[j]){
                j--;
            }
        }
        return maxx;
    }
}
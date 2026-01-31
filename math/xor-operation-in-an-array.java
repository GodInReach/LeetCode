class Solution {
    public int xorOperation(int n, int start) {
        int xsum = start;
        for (int i = 1; i<n; i++){
            xsum^=(start+2*i);
        }
        return xsum;
    }
}
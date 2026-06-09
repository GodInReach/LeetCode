class Solution {
    int[][] diff = {{0,-1},{0,1},{-1,0},{1,0}};
    public int dfs(int[][] matrix, int[][] mem, int rlen, int clen, int row, int col){
        if(mem[row][col]!=0){
            return mem[row][col];
        }
        int amax = 0;
        for(int i = 0; i<4; i++){
            int arow = row+diff[i][0];
            int acol = col+diff[i][1];
            if(arow>=0 && arow<rlen && acol>=0 && acol<clen && matrix[arow][acol]>matrix[row][col]){
                amax=Math.max(amax,dfs(matrix,mem,rlen,clen,arow,acol));
            }
        }
        mem[row][col]=1+amax;
        return amax+1;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int rlen = matrix.length;
        int clen = matrix[0].length;
        int[][] mem = new int[rlen][clen];
        int maxl = 0;
        for(int row = 0; row<rlen; row++){
            for(int col = 0; col<clen; col++){
                maxl=Math.max(maxl,dfs(matrix,mem,rlen,clen,row,col));
            }
        }
        return maxl;
    }
}
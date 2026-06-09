class Solution {
    int[][] diff = {{0,-1},{0,1},{-1,0},{1,0}};
    public void dfs(char grid[][],int rlen,int clen,int row, int col){
        grid[row][col]='0';
        for(int i = 0; i<4; i++){
            int ajrow=row+diff[i][0];
            int ajcol=col+diff[i][1];
            if(ajrow>=0 && ajrow<rlen && ajcol>=0 && ajcol<clen && grid[ajrow][ajcol]=='1'){
                dfs(grid,rlen,clen,ajrow,ajcol);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int rlen = grid.length;
        int clen = grid[0].length;
        int islands = 0;
        for(int row = 0; row<rlen; row++){
            for(int col = 0; col<clen; col++){
                if(grid[row][col]=='1'){
                    islands+=1;
                    dfs(grid,rlen,clen,row,col);
                }
            }
        }
        return islands;
    }
}
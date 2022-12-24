class Solution {
    public int islandPerimeter(int[][] grid) {
        int x=0,r=grid.length,c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==0) continue;
                if(i==0 || grid[i-1][j]==0) x++;
                if(i==r-1 || grid[i+1][j]==0) x++;
                if(j==0 || grid[i][j-1]==0) x++;
                if(j==c-1 || grid[i][j+1]==0) x++;
            }
        }
        return x;
    }
}

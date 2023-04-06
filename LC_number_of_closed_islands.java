class Solution {
    public int closedIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid[0].length;j++)
        if(grid[i][j]==0){
            fl=1;
            harsh(grid,i,j);
            if(fl==1) ans++;
        }
        return ans;
    }
    int fl;
    public void harsh(int grid[][],int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==1) return;
        if(i==0||j==0||i==grid.length-1||j==grid[0].length-1) fl=0;
        grid[i][j]=1;
        harsh(grid,i,j+1);
        harsh(grid,i,j-1);
        harsh(grid,i+1,j);
        harsh(grid,i-1,j);
    }
}

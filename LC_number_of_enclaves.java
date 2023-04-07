class Solution {
    public int numEnclaves(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid[0].length;j++)
        if((i==0||j==0||i==grid.length-1||j==grid[0].length-1)&&grid[i][j]==1)
        harsh(grid,i,j);
        for(int i[]:grid)
        for(int j:i)
        ans+=j;
        return ans;
    }
    public void harsh(int grid[][],int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]==0) return;
        grid[i][j]=0;
        harsh(grid,i,j+1);
        harsh(grid,i,j-1);
        harsh(grid,i+1,j);
        harsh(grid,i-1,j);
    }
}

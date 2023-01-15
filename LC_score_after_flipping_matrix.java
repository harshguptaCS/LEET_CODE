class Solution {
    public int matrixScore(int[][] grid) {
        for(int i=0;i<grid.length;i++)
        if(grid[i][0]==0)
        for(int j=0;j<grid[0].length;j++)
        grid[i][j]=1-grid[i][j];
        int sum=grid.length*(int)Math.pow(2,grid[0].length-1);
        for(int i=1;i<grid[0].length;i++){
            int s=0;
            for(int j=0;j<grid.length;j++)
            s+=grid[j][i];
            if(s<=grid.length/2)
            s=grid.length-s;
            sum+=s*(int)Math.pow(2,grid[0].length-i-1);
        }
        return sum;
    }
}

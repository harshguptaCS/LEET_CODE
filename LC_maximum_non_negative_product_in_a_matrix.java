class Solution {
    public int maxProductPath(int[][] grid) {
        harsh(0,0,grid,grid[0][0]);
        return (int)(x%1000000007);
    }
    long x=-1;
    public void harsh(int i,int j,int[][] grid,long pd){
        if(pd==0){
            if(0>x)x=0;
            return;
        }
        if(i==grid.length-1&&j==grid[0].length-1){
            if(pd>=0&&pd>x) x=pd;
            return;
        }
        if(j!=grid[0].length-1){
            harsh(i,j+1,grid,pd*grid[i][j+1]);
        }
        if(i!=grid.length-1){
            harsh(i+1,j,grid,pd*grid[i+1][j]);
        }
    }
}

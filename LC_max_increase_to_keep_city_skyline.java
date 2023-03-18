class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int l[]=new int[grid.length];
        int b[]=new int[grid.length];
        for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid.length;j++){
            l[i]=Math.max(l[i],grid[i][j]);
            b[i]=Math.max(b[i],grid[j][i]);
        }
        int s=0;
        for(int i=0;i<grid.length;i++)
        for(int j=0;j<grid.length;j++)
        s+=Math.min(l[i],b[j])-grid[i][j];
        return s;
    }
}

class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int ans[]=new int[grid[0].length];
        for(int j=0;j<grid[0].length;j++){
            int max=0;
            for(int i=0;i<grid.length;i++){
                int m=0,x=grid[i][j];
                if(x<=0) m=1;
                while(x!=0){
                    x/=10;
                    m++;
                }
                max=Math.max(max,m);
            }
            ans[j]=max;
        }
        return ans;
    }
}

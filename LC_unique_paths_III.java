class Solution {
    public int uniquePathsIII(int[][] grid) {
        int sr=0,sc=0,x=grid.length*grid[0].length;
		for(int i=0;i<grid.length;i++)
		for(int j=0;j<grid[0].length;j++){
		    if(grid[i][j]==1){
		        sr=i;
		        sc=j;
		    }
		    if(grid[i][j]==-1) x--;
		}
		harsh(grid,sr,sc,x,1);
		return count;
	}
	int count=0;
    int r[]={-1,1,0,0};
	int c[]={0,0,1,-1};
	public void harsh(int grid[][],int i,int j,int x,int C){
	    if(i<0||j<0||i==grid.length||j==grid[0].length||grid[i][j]==-1) return;
	    if(grid[i][j]==2){
	        if(C==x)count++;
	        return;
	    }
	    grid[i][j]=-1;
	    for(int k=0;k<4;k++)
	    harsh(grid,i+r[k],j+c[k],x,C+1);
	    grid[i][j]=0;
	}
}

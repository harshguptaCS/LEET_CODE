class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length,n=mat[0].length,c=0;
		int a[]=new int[m*n];
		a[0]=mat[0][0];
        if(m*n==1) return a;
        if(n==1){
		    for(int []x:mat)
		    a[c++]=x[0];
            return a;
		}
		if(m==1){
		    for(int x:mat[0])
		    a[c++]=x;
            return a;
		}
		down(mat,a,0,1,1);
		return a;
	}
	public void down(int mat[][],int a[],int x,int y,int c){
	    while(x!=mat.length-1&&y!=0){
	        a[c++]=mat[x][y];
	        x++;
	        y--;
	    }
	    if(x+1<mat.length){
	        a[c++]=mat[x][y];
	        up(mat,a,x+1,y,c);
	    }
	    else if(y+1<mat[0].length){
	        a[c++]=mat[x][y];
	        up(mat,a,x,y+1,c);
	    }
	    else{
	        a[c++]=mat[x][y];
	        return;
	    }
	}
	public void up(int mat[][],int a[],int x,int y,int c){
	    while(x!=0&&y!=mat[0].length-1){
	        a[c++]=mat[x][y];
	        x--;
	        y++;
	    }
	    if(y+1<mat[0].length){
	        a[c++]=mat[x][y];
	        down(mat,a,x,y+1,c);
	    }
	    else if(x+1<mat.length){
	        a[c++]=mat[x][y];
	        down(mat,a,x+1,y,c);
	    }
	    else{
	        a[c++]=mat[x][y];
	        return;
	    }
	}
}

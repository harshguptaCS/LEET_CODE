class Solution {
    public int countArrangement(int n) {
		harsh(n,new int[n],1);
		return count;
	}
    int count=0;
	public void harsh(int n,int []a,int x){
	    if(x>n){
	        count++;
	        return;
	    }
	    for(int i=1;i<=n;i++){
	        if((a[i-1]==1)||(i%x!=0&&x%i!=0)) continue;
	        a[i-1]=1;
	        harsh(n,a,x+1);
	        a[i-1]=0;
	    }
	}
}

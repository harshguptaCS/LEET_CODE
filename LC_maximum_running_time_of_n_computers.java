class Solution {
    public long maxRunTime(int n, int[] batteries) {
		long l=0,r=0,m,ans=0;
        for(int x:batteries)
        r+=x;
        while(l<=r){
            m=l+(r-l)/2;
            if(harsh(batteries,m,n)) {
                ans=m;
                l=m+1;
            }
            else r=m-1;
        }
        return ans;
	}
	public boolean harsh(int batteries[],long m,int n){
	    long tt= m*n;
      for(int b: batteries) tt-=Math.min(m, b);
      return tt<=0;
	}
}

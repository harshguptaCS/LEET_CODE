class Solution {
    public long[] kthPalindrome(int[] queries, int n) {
        long x=(long)Math.pow(10,n-1)+1;
        if(n==1) x=1;
        long l[]=new long[queries.length];
		for(int j=0;j<queries.length;j++)
		l[j]=harsh(x,queries[j],n);
        return l;
	}
	public static long harsh(long ans,int x,int n){
	    if(x==1) return ans;
        if(x>9*Math.pow(10,(n+1)/2-1)) return -1;
	    x--;
	    for(int i=(n+1)/2-1;i>=0;i--){
	        ans+=(x%10)*Math.pow(10,n-i-1);
	        if(i!=n-1-i)
	        ans+=(x%10)*Math.pow(10,i);
	        x=x/10;
	    }
	    return ans;
	}
}

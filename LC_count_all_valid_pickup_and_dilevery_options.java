class Solution {
    public int countOrders(int n) {
        long dp[]=new long[n+2],mod=1000000007;
        dp[1]=1;
        dp[2]=6;
        for(int i=3;i<=n;i++){
            long pos=2*i-1,per=pos*(pos+1)/2;
            dp[i]=dp[i-1]*per%mod;
        }
        return (int)dp[n];
    }
}

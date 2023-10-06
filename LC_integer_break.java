class Solution {
    public int integerBreak(int n) {
        if(n==2||n==3) return n-1;
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<=n;i++){
            int mx=0;
            for(int j=1;j<=i/2;j++)
            mx=Math.max(mx,dp[j]*dp[i-j]);
            dp[i]=mx;
        }
        return dp[n];
    }
}

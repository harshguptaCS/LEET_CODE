class Solution {
    public int uniquePathsWithObstacles(int[][] mat) {
        int m=mat.length,n=mat[0].length,dp[][]=new int[m][n];
        if(mat[m-1][n-1]==1) return 0;
        dp[m-1][n-1]=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(mat[i][j]==1||i==m-1&&j==n-1);
                else if(i==m-1) dp[i][j]=dp[i][j+1];
                else if(j==n-1) dp[i][j]=dp[i+1][j];
                else dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}

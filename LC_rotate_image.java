class Solution {
    public void rotate(int[][] a) {
        int n=a.length;
        for(int i=0;i<n;i++)
            for(int j=i;j<n-1-i;j++){
                int t1,t2;
                t1=a[j][n-1-i];
                a[j][n-1-i]=a[i][j];
                t2=a[n-1-i][n-1-j];
                a[n-1-i][n-1-j]=t1;
                t1=a[n-1-j][i];
                a[n-1-j][i]=t2;
                a[i][j]=t1;
            }
    }
}

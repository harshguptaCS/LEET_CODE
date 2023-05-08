class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0,n=mat.length;
        for(int i=0;i<n;i++){
            s+=mat[i][i];
            if(i!=n-1-i) s+=mat[i][n-1-i];
        }
        return s;
    }
}

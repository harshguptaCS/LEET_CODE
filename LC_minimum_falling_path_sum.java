class Solution {
    public int minFallingPathSum(int[][] matrix) {
        for(int i=matrix.length-2;i>=0;i--){
            for(int j=0;j<matrix[0].length;j++){
                int mn=matrix[i+1][j];
                if(j>0) mn=Math.min(mn,matrix[i+1][j-1]);
                if(j<matrix[0].length-1) mn=Math.min(mn,matrix[i+1][j+1]);
                matrix[i][j]=matrix[i][j]+mn;
            }
        }
        int m=matrix[0][0];
        for(int i:matrix[0]) m=Math.min(m,i);
        return m;
    }
}

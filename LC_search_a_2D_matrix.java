class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length-1;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]>target){
                m=i-1;
                break;
            }
        }
        if(m<0)
        m=0;
        for(int i=0;i<matrix[m].length;i++)
            if(matrix[m][i]==target)
                return true;
        return false;        
    }
}

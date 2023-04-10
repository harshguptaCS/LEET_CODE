class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length,i=0,j=0;
        List<Integer> ans=new ArrayList<>();
        for(int r=0;r<m/2+m%2;r++){
            if(j>=n-r) break;
            while(j<n-r)
            ans.add(matrix[i][j++]);
            j--;
            i++;
            if(i>=m-r) break;
            while(i<m-r)
            ans.add(matrix[i++][j]);
            i--;
            j--;
            if(j<r) break;
            while(j>=r)
            ans.add(matrix[i][j--]);
            j++;
            i--;
            if(i<r) break;
            while(i>r)
            ans.add(matrix[i--][j]);
            i++;
            j++;
        }
        return ans;
    }
}

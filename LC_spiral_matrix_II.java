class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int[n][n],i=0,j=0,c=1;
        for(int r=0;r<n/2+n%2;r++){
            if(j>=n-r) break;
            while(j<n-r)
            ans[i][j++]=c++;
            j--;
            i++;
            if(i>=n-r) break;
            while(i<n-r)
            ans[i++][j]=c++;
            i--;
            j--;
            if(j<r) break;
            while(j>=r)
            ans[i][j--]=c++;
            j++;
            i--;
            if(i<r) break;
            while(i>r)
            ans[i--][j]=c++;
            i++;
            j++;
        }
        return ans;
    }
}

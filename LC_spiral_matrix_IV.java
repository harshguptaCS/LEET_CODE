class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][]=new int[m][n],i=0,j=0;
        for(int[] row:ans)   Arrays.fill(row,-1);
        for(int r=0;r<m/2+m%2;r++){
            if(j>=n-r) break;
            while(j<n-r){
                if(head==null) break;
                ans[i][j++]=head.val;
                head=head.next;
            }
            j--;
            i++;
            if(i>=m-r) break;
            while(i<m-r){
                if(head==null) break;
                ans[i++][j]=head.val;
                head=head.next;
            }
            i--;
            j--;
            if(j<r) break;
            while(j>=r){
                if(head==null) break;
                ans[i][j--]=head.val;
                head=head.next;
            }
            j++;
            i--;
            if(i<r) break;
            while(i>r){
                if(head==null) break;
                ans[i--][j]=head.val;
                head=head.next;
            }
            i++;
            j++;
        }
        return ans;
    }
}

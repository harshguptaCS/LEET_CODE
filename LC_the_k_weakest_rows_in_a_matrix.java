class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] arr=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            arr[i][0]=i;
            int s=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0) break;
                s++;
            }
            arr[i][1]=s;
        }
        Arrays.sort(arr,(a,b)->{
            if(a[1]!=b[1]) return a[1]-b[1];
            return a[0]-b[0];
        });
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        ans[i]=arr[i][0];
        return ans;
    }
}

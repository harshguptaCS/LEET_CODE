class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int in=0,ans=mat[0].length;
        for(int i=0;i<mat.length;i++){
            int m=0;
            for(int j:mat[i]){
                if(m>ans) break;
                if(j==0) m++;
            }
            if(m<ans) in =i;
            ans=Math.min(ans,m);
        }
        return new int[]{in,mat[0].length-ans};
    }
}

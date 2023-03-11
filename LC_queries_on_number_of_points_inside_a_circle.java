class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int r=queries[i][2],x=queries[i][0],y=queries[i][1];
            for(int j=0;j<points.length;j++){
                int x2=points[j][0],y2=points[j][1];
                if((x-x2)*(x-x2)+(y-y2)*(y-y2)<=r*r) ans[i]++;
            }
        }
        return ans;
    }
}

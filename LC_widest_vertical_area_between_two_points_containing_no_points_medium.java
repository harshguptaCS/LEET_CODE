class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int a[]=new int[points.length],c=0,ans=0;
        for(int i[]:points)
        a[c++]=i[0];
        Arrays.sort(a);
        for(int i=1;i<a.length;i++)
        ans=Math.max(ans,a[i]-a[i-1]);
        return ans;
    }
}

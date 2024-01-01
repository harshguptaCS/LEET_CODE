class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0,j=0,i=0,n=g.length,m=s.length;
        while(i<n&&j<m){
            if(s[j]>=g[i]){
                ans++;
                j++;
                i++;
            }
            else j++;
        }
        return ans;
    }
}

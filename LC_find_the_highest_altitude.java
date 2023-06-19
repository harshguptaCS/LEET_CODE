class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0,a=0;
        for(int i=0;i<gain.length;i++){
            a+=gain[i];
            ans=Math.max(ans,a);
        }
        return ans;
    }
}

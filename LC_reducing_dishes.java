class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int ans=0,suf=0,t=0;
        for(int i=satisfaction.length-1;i>=0;i--){
            suf+=satisfaction[i];
            t+=suf;
            ans=Math.max(ans,t);
        }
        return ans;
    }
}

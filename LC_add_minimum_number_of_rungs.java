class Solution {
    public int addRungs(int[] rungs, int dist) {
        int ans=0,x=0;
        for(int i=0;i<rungs.length;i++){
            if(rungs[i]-x>dist){
                if((rungs[i]-x)%dist==0) ans+=(rungs[i]-x)/dist-1;
                else ans+=(rungs[i]-x)/dist;
            }
            x=rungs[i];
        }
        return ans;
    }
}

class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int in=0,ans=nums.length,ret=divisors[0];
        for(int i=0;i<divisors.length;i++){
            int m=0,x=divisors[i];
            for(int j:nums){
                if(m>ans) break;
                if(j%x!=0) m++;
            }
            if(m==ans) ret=Math.min(ret,x);
            if(m<ans) ret=x;
            ans=Math.min(ans,m);
        }
        return ret;
    }
}

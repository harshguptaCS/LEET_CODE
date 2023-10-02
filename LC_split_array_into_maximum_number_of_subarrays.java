class Solution {
    public int maxSubarrays(int[] nums) {
        int r=Integer.MAX_VALUE;
        for(int i:nums) r&=i;
        if(r!=0) return 1;
        int c=Integer.MAX_VALUE,ans=0;
        for(int i:nums){
            c&=i;
            if(c==r){
                ans++;
                c=Integer.MAX_VALUE;
            }
        }
        return ans;
    }
}

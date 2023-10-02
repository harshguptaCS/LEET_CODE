class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long ans=0;
        int lm[]=new int[n];
        int rm[]=new int[n];
        lm[0]=nums[0];
        rm[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            lm[i]=Math.max(lm[i-1],nums[i]);
            rm[n-i-1]=Math.max(rm[n-i],nums[n-i-1]);
        }
        for(int i=1;i<n-1;i++){
            long sum=(lm[i-1]-nums[i])*(long)rm[i+1];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}

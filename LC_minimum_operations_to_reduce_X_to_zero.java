class Solution {
    public int minOperations(int[] nums, int x) {
        int l=0,sum=0,ts,ans=Integer.MAX_VALUE;
        for(int i:nums) sum+=i;
        ts=sum-x;
        sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>ts)
            while(sum>ts&&l<=i){
                sum-=nums[l];
                l++;
            }
            if(sum==ts) ans=Math.min(ans,l+nums.length-i-1);
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}

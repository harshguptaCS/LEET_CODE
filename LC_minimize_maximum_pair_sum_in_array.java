class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0,n=nums.length-1;
        for(int i=0;i<=n;i++)
        ans=Math.max(ans,nums[i]+nums[n-i]);
        return ans;
    }
}

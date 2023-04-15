class Solution {
    public long[] findPrefixScore(int[] nums) {
        long pr=0,max=0;
        long ans[]=new long[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            ans[i]=nums[i]+max+pr;
            pr+=nums[i]+max;
        }
        return ans;
    }
}

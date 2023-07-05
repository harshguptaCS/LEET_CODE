class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length,l=0,z=0,ans=0;
        for (int i=0;i<n;i++) {
            if(nums[i]==0) z++;
            while (z>1){
                if(nums[l]==0)z--;
                l++;
            }
            ans=Math.max(ans,i-l+1-z);
        }
        if(ans==n) return n-1;
        return ans;
    }
}

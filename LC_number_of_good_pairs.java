class Solution {
    public int numIdenticalPairs(int[] nums) {
        Arrays.sort(nums);
        int x=1,ans=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) x++;
            else{
                ans+=x*(x-1)/2;
                x=1;
            }
        }
        ans+=x*(x-1)/2;
        return ans;
    }
}

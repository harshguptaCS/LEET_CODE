class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0,ans=0;
        for(int i:nums)
        if(i==0){
            ans+=++c;
        }
        else c=0;
        return ans;
    }
}

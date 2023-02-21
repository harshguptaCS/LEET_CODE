class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,r=nums.length-1;
        while(r-l>1){
            int m=l+(r-l)/2;
            if((m-l)%2==1) m--;
            if(nums[m]==nums[m+1]) l=m+2;
            else r=m+1;
        }
        return nums[l];
    }
}

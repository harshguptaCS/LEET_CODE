class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target) return nums.length;
        int l=0,r=nums.length-1,m;
        while(l<r){
            m=l+(r-l)/2;
            if(nums[m]<target) l=m+1;
            else r=m;
        }
        return l;
    }
}

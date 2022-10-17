class Solution {
    public int search(int[] nums, int target) {
        return rec(nums,target,nums.length-1);
    }
    public static int rec(int[]nums,int t,int n){
        if(n<0)
            return -1;
        if(nums[n]==t)
            return n;
        else
            return rec(nums,t,n-1);
    }
}

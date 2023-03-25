class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] a=new int[nums.length];
        int l=0,r=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                a[l]=nums[i];
                l+=2;
            }
            else{
                a[r]=nums[i];
                r+=2;
            }
        }
        return a;
    }
}

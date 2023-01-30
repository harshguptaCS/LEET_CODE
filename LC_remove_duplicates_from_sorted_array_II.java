class Solution {
    public int removeDuplicates(int[] nums) {
        int x=1,c=1;
        for(int i=1;i<nums.length;i++){
            if((nums[i]==nums[i-1])&&x<2){
                nums[c++]=nums[i];
                x++;
            }
            else if(nums[i]!=nums[i-1]){
                nums[c++]=nums[i];
                x=1;
            }
        }
        return c;
    }
}

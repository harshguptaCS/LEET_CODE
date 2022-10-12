class Solution {
    public int removeDuplicates(int[] nums) {
        int t=nums[0],x=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=t){
                nums[x]=nums[i];
                x++;
                t=nums[i];
            }
        }
        for(int i=x;i<nums.length;i++){
            nums[i]='_';
        }
        return x;
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rev(nums,nums.length-k,nums.length-1);
        rev(nums,0,nums.length-k-1);
        rev(nums,0,nums.length-1);
    }
    public void rev(int nums[],int i,int j){
        while(i<j){
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
            i++;
            j--;
        }
    }
}

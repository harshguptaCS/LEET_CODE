class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int s=0,e=nums.length-1;
        while(s<e){
            if(nums[s]%2==1){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                e--;
            }
            else s++;
        }
        return nums;
    }
}

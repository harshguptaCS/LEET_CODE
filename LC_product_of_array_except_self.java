class Solution {
    public int[] productExceptSelf(int[] nums) {
        int fl=0,p=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(fl==0){
                    fl++;
                    continue;
                }
                else{
                    fl++;
                    break;
                }
            }
            else p*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(fl==0) nums[i]=p/nums[i];
            else if(fl==1){
                if(nums[i]==0) nums[i]=p;
                else nums[i]=0;
            }
            else nums[i]=0;
        }
        return nums;
    }
}

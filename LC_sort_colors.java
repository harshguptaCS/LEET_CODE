class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int fl=0;
            if(nums[i]==0) continue;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                    i--;
                    fl=1;
                    break;
                }
            }
            if(fl==0&&nums[i]==2) break;
        }
    }
}

class Solution {
    public int jump(int[] nums) {
        harsh(nums,0);
        return count;
    }
    int count=0;
    public void harsh(int nums[],int i){
        if(i>=nums.length-1) return;
        int in=i+1;
        if(nums[i]+i>=nums.length-1){
            count++;
            return;
        }
        for(int j=i+1;j<=Math.min(i+nums[i],nums.length-1);j++){
            if(nums[in]+in<=nums[j]+j){
            in=j;
            }
        }
        count++;
        harsh(nums,in);
    }
}

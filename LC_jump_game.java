class Solution {
    public boolean canJump(int[] nums) {
        return harsh(nums,0);
    }
    public boolean harsh(int nums[],int i){
        if(i>=nums.length-1) return true;
        int in=i+1;
        for(int j=i+1;j<=Math.min(i+nums[i],nums.length-1);j++){
            if(nums[in]+in<=nums[j]+j)
            in=j;
        }
        if(nums[i]==0&&i!=nums.length-1) return false;
        if(harsh(nums,in)) return true;
        return false;
    }
}

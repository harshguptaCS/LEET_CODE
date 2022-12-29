class Solution {
    public int pivotIndex(int[] nums) {
        int s1=0,s2=0;
        for(int i=1;i<nums.length;i++) s2+=nums[i];
        for(int i=0;i<nums.length;i++){
            if(s1==s2) return i;
            else if(i<nums.length-1){
                s1+=nums[i];
                s2-=nums[i+1];
            }
        }
        return -1;
    }
}

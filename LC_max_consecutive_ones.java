class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0,x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) x++;
            else{
                if(x>m) m=x;
                x=0;
            }
        }
        if(x>m) m=x;
        return m;
    }
}

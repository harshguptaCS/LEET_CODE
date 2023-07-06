class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,s=0,m=0;
        while(j<=nums.length){
            if(s<target){
                if(j==nums.length) break;
                s+=nums[j];
                j++;
            }
            else{
                if(m!=0) m=Math.min(m,j-i);
                else m=j-i;
                s-=nums[i];
                i++;
            }
        }
        return m;
    }
}

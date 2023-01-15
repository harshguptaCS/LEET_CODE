class Solution {
    public int minimumAverageDifference(int[] nums) {
        if(nums.length==1) return 0;
        long s1=0,s2=0;
        for(int i=0;i<nums.length;i++) s2+=nums[i];
        long min,harsh=0;
        int in=0;
        for(int i=0;i<nums.length-1;i++){
            s1+=nums[i];
            s2-=nums[i];
            min=s1/(i+1)-s2/(nums.length-i-1);
            if(min<0) min*=-1;
            if(i==0) harsh=min;
            if(min<harsh){
                harsh=min;
                in=i;
            }
        }
        s1+=nums[nums.length-1];
        if(harsh>(s1/nums.length)) return nums.length-1;
        return in;
    }
}

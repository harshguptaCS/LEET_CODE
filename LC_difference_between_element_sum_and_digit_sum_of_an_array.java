class Solution {
    public int differenceOfSum(int[] nums) {
        int s1=0;
        for(int i:nums){
            s1+=i;
            while(i>0){
                s1-=i%10;
                i/=10;
            }
        }
        return Math.abs(s1);
    }
}

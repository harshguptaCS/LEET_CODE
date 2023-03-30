class Solution {
    public int averageValue(int[] nums) {
        int ans=0,c=0;
        for(int i:nums)
        if(i%6==0){
            ans+=i;
            c++;
        }
        if(ans==0) return 0;
        return ans/c;
    }
}

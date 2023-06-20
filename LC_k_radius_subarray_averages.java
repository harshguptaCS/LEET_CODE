class Solution {
    public int[] getAverages(int[] nums, int k) {
        int ans[]=new int[nums.length],l=2*k+1,m=2*k;
        long s=0;
        Arrays.fill(ans,-1);
        if(l>nums.length) return ans;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(i>=m){
                int avg=(int)(s/l);
                ans[i-k]=avg;
                s-=nums[i-m];
            }
        }
        return ans;
    }
}

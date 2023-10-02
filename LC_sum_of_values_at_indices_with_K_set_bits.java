class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int pow=2,ind[]=new int[nums.size()],ans=0;
        if(k==0) return nums.get(0);
        if(k==1) ans=nums.get(1);
        if(nums.size()<2) return 0;
        ind[1]=1;
        for(int i=2;i<ind.length;i++){
            if(i==pow*2) pow*=2;
            ind[i]=ind[i-pow]+1;
            if(ind[i]==k)ans+=nums.get(i);
        }
        return ans;
    }
}

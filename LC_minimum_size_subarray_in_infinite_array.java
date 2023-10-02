class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        int sum=0,ans;
        for(int i:nums) sum+=i;
        if(target%sum==0) return target/sum*nums.length;
        ans=target/sum*nums.length;
        target=target%sum;
        int newAr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            newAr[i]=nums[i];
            newAr[nums.length+i]=nums[i];
        }
        int mn=0,l=0,r=0,s=0;
        while(l<=r &&r<newAr.length){
            if(r<newAr.length){
                s+=newAr[r];
                r++;
            }
            if(s>target){
                while(s>target){
                    s-=newAr[l];
                    l++;
                }
            }
            if(s==target){
                if(mn!=0) mn=Math.min(mn,r-l);
                else mn=r-l;
            }
        }
        if(mn==0) return -1;
        return ans+mn;
    }
}

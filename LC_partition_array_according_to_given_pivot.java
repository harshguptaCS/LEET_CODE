class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length,ans[]=new int[n],l=0,r=n-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) ans[l++]=nums[i];
            if(nums[n-1-i]>pivot) ans[r--]=nums[n-1-i];
        }
        for(int i=l;i<=r;i++)
        ans[i]=pivot;
        return ans;
    }
}

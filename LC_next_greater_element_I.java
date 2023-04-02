class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int np[]=new int[nums2.length];
        for(int i=nums2.length-2;i>=0;i--)
        for(int j=i+1;j<nums2.length;j+=np[j]){
            if(nums2[i]<nums2[j]){
                np[i]=j-i;
                break;
            }
            if(np[j]==0) break;
        }
        int ans[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        for(int j=0;j<nums2.length;j++)
        if(nums1[i]==nums2[j]){
            if(np[j]==0) ans[i]=-1;
            else ans[i]=nums2[np[j]+j];
            break;
        }
        return ans;
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x=m-1,y=n-1;
        for(int i=m+n-1;i>=0;i--){
            if(y==-1)
                break;
            if(x==-1||nums1[x]<nums2[y]){
                nums1[i]=nums2[y];
                y--;
            }
            else if(nums1[x]>=nums2[y]){
                nums1[i]=nums1[x];
                x--;
            }
            if(x==-1&&y==-1){
                break;
            }
        }
    }
}

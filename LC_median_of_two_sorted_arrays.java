class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length,x=m-1,y=n-1;
        int num[]=new int[m+n];
        for(int i=m+n-1;i>=0;i--){
            if(x==-1){
                num[i]=nums2[y];
                y--;
            }
            else if(y==-1){
                num[i]=nums1[x];
                x--;
            }
            else if(nums1[x]>nums2[y]){
                num[i]=nums1[x];
                x--;
            }
            else{
                num[i]=nums2[y];
                y--;
            }
        }
        if((m+n)%2==0)
            return (num[(m+n)/2-1]+num[(m+n)/2])/2.0;
        else
            return num[(m+n+1)/2-1];
    }
}

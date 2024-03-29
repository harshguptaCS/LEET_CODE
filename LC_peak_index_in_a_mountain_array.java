class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=1,r=arr.length-2;
        while(l<r){
            int m=l+(r-l)/2;
            if(arr[m]<arr[m+1]) l=m+1;
            else r=m;
        }
        return l;
    }
}

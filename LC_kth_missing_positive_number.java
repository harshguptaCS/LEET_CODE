class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(k<arr[0]) return k;
        else k=k-arr[0]+1;
        for(int i=1;i<arr.length;i++)
        if(arr[i]!=arr[i-1]+1)
        if(k-arr[i]+arr[i-1]<0) return arr[i-1]+k;
        else k=k-arr[i]+arr[i-1]+1;
        return arr[arr.length-1]+k;
    }
}

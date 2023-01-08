class Solution {
    public boolean validMountainArray(int[] arr) {
        int in=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]) break;
            in=i;
        }
        if(in==arr.length-1||in==0) return false;
        for(int i=in+1;i<arr.length;i++)
        if(arr[i]>=arr[i-1]) return false;
        return true;
    }
}

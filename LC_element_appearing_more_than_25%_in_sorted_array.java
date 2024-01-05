class Solution {
    public int findSpecialInteger(int[] arr) {
        int x=arr.length/4,c=1,p=arr[0];
        for (int i=1;i<arr.length;i++) {
            if(p==arr[i]) c++;
            else {
                c=1;
                p=arr[i];
            }
            if(c>x) return arr[i];
        }
        return p;
    }
}

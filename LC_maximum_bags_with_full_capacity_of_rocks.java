class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n=capacity.length;
        int [] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(ar);
        for(int i=0;i<n;i++){
            additionalRocks-=ar[i];
            if(additionalRocks<0){
                return i;
            }
        }
        return n;
    }
}

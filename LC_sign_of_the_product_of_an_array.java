class Solution {
    public int arraySign(int[] nums) {
        int c=0;
        for(int x:nums){
            if(x==0) return 0;
            if(x<0) c++;
        }
        if(c%2==0) return 1;
        return -1;
    }
}

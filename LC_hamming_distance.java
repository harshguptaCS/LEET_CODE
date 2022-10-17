class Solution {
    public int hammingDistance(int x, int y) {
        return hd(x^y);
    }
    public static int hd(int n){
        if(n==0)
            return 0;
        else
            return (n&1)+hd(n>>1);
    }
}

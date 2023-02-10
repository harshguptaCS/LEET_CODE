class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        int l=1,r=x,a=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if(m>x/m) r=m-1;
            else if(m<x/m){
                l=m+1;
                a=m;
            }
            else return m;
        }
        return a;
    }
}

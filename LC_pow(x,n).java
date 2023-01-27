class Solution {
    public double myPow(double x, int n) {
        if(x==0||x==1) return x;
        if(n<0){
            x=1/x;
            n=-1*n;
        }
        return harsh(x,n);
    }
    public double harsh(double x,int n){
        if(n==0) return 1;
        if(n==1) return x;
        if(n%2==0) return harsh(x*x,n/2);
        return harsh(x*x,n/2)*x;
    }
}

class Solution {
    public int fib(int n) {
        int a=0,b=1,c=1;
        for(int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        return a;
    }
}

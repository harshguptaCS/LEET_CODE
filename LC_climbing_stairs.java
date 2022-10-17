class Solution {
    public int climbStairs(int n) {
        int a,b=1,c=1;
        for(int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        return b;
    }
}

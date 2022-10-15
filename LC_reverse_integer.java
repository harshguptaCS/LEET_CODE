class Solution {
    public int reverse(int x) {
        int t=x,r;
        long rev=0;
        while(t!=0){
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        if(rev<-2147483648||rev>2147483647)
            return 0;
        return (int)rev;
    }
}

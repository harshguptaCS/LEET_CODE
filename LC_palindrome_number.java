class Solution {
    public boolean isPalindrome(int x) {
        int t=x,r,rev=0;
        if(x<0)
            return false;
        while(t!=0){
            r=t%10;
            rev=rev*10+r;
            t=t/10;
        }
        if(rev==x)
            return true;
        return false;
    }
}

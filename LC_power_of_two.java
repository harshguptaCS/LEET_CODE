class Solution {
    public boolean isPowerOfTwo(int n) {
        int x=0;
        while(n>1||n<-1){
            if(n%2==1) return false;
            else n=n/2;
            x++;
        }
        if((n<=0&&x%2==0)||n==-1) return false;
        return true;
    }
}

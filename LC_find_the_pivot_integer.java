class Solution {
    public int pivotInteger(int n) {
        int s1=n*(n+1)/2,s2=n;
        while(s1>=s2){
            if(s1==s2) return n;
            s1-=n;
            n--;
            s2+=n;
        }
        return -1;
    }
}

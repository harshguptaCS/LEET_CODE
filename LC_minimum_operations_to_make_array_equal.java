class Solution {
    public int minOperations(int n) {
        int m;
        if(n%2==1) m=2*(n/2)+1;
        else m=n;
        return m*(n/2)-(n/2)*(n/2);
    }
}

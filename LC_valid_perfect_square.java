class Solution {
    public boolean isPerfectSquare(int num) {
        int l=1,r=num;
        while(l<=r){
            int m=l+(r-l)/2;
            if(m*m==num) return true;
            else if(m>num/m) r=m-1;
            else l=m+1;
        }
        return false;
    }
}

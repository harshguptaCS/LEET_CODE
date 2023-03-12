class Solution {
    public int countDigits(int num) {
        int t=num,ans=0,r;
        while(t>0){
            r=t%10;
            t/=10;
            if(num%r==0) ans++;
        }
        return ans;
    }
}

class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        int m=1,i=2;
        while(num/i>i){
            if(num%i==0){
                m+=i;
                m+=num/i;
            }
            i++;
            if(i==num/2) break;
        }
        if(m==num) return true;
        return false;
    }
}

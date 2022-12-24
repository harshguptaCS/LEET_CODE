class Solution {
    public int findComplement(int num) {
        int c=1;
        long x=1;
        while(true){
            if(num/x>1){
                x*=2;
                c++;
            }
            else{
                return (int)(Math.pow(2,c)-1-num);
            }    
        }
    }
}

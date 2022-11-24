class Solution {
    public String convertToTitle(int n) {
        int x;
        StringBuilder s=new StringBuilder();
        while(n>0){
            if(n>26){
                x=n%26;
                n=n/26;
                if(x==0){
                    n=n-1;
                    s.insert(0,'Z');
                    continue;
                }
                s.insert(0,(char)(x+64));
            }
            else{
                s.insert(0,(char)(n+64));
                break;
            }
        }
        return s.toString();
    }
}

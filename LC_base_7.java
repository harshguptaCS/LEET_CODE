class Solution {
    public String convertToBase7(int num) {
        int fl=0;
        StringBuilder s=new StringBuilder();
        if(num<0){
            fl=1;
            num*=-1;
        }
        while(num>=7){
            s.insert(0,num%7);
            num/=7;
            if(num<7) break;
        }
        s.insert(0,num);
        if(fl==1) s.insert(0,'-');
        return s.toString();
    }
}

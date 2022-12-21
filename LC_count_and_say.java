class Solution {
    public String countAndSay(int n) {
        StringBuilder s=new StringBuilder("1");
        if(n==1) return s.toString();
        for(int i=2;i<=n;i++){
            int x=1;
            StringBuilder temp=new StringBuilder();
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(j)==s.charAt(j+1)) x++;
                else{
                    temp.append(x);
                    temp.append(s.charAt(j));
                    x=1;
                }
            }
            temp.append(x);
            temp.append(s.charAt(s.length()-1));
            s=temp;
        }
        return s.toString();
    }
}

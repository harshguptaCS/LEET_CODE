class Solution {
    int i=0;
    public String decodeString(String s) {
        StringBuilder s1=new StringBuilder();
        while(i!=s.length()){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                int x=0;
                while(s.charAt(i)!='['){
                    x=x*10+s.charAt(i)-'0';
                    i++;
                }
                i++;
                String s2=decodeString(s);
                for(int j=1;j<=x;j++){
                    s1.append(s2);
                }
            }
            if(i>=s.length()) break;
            if(s.charAt(i)==']'){
                i++;
                return s1.toString();
            }
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                s1.append(s.charAt(i));
                i++;
            }
        }
        return s1.toString();
    }
}

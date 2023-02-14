class Solution {
    public String addBinary(String a, String b) {
        int c=0,n=Math.max(a.length(),b.length());
        char s[]=new char[n];
        for(int i=0;i<n;i++){
            if(i<a.length()) c+=a.charAt(a.length()-1-i)-'0';
            if(i<b.length()) c+=b.charAt(b.length()-1-i)-'0';
            s[n-1-i]=(char)(c%2+'0');
            c=c/2;
        }
        if(c==1) return "1"+new String(s);
        return new String(s);
    }
}

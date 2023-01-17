class Solution {
    public int longestPalindrome(String s) {
        int [] a=new int[26];
        int [] b=new int[26];
        int fl=0,x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z') a[s.charAt(i)-'a']++;
            else b[s.charAt(i)-'A']++;
        }
        for(int i=0;i<26;i++){
            if(fl==0&&(a[i]%2==1||b[i]%2==1)){
                fl=1;
                x++;
            }
            x+=a[i]/2*2;
            x+=b[i]/2*2;
        }
        return x;
    }
}

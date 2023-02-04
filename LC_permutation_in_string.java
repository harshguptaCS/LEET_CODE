class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']++;
        }
        int sum=0,l=0;
        for(int i=0;i<s2.length();i++){
            if(sum==s1.length()) return true;
            b[s2.charAt(i)-'a']++;
            sum++;
            if(b[s2.charAt(i)-'a']>a[s2.charAt(i)-'a']){
                int in=i;
                for(int j=l;j<=i;j++){
                    b[s2.charAt(j)-'a']--;
                    sum--;
                    if(s2.charAt(j)==s2.charAt(i)){
                        in =j;
                        break;
                    }
                }
                l=in+1;
            }
        }
        if(sum==s1.length()) return true;
        return false;
    }
}

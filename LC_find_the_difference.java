class Solution {
    public char findTheDifference(String s, String t) {
        int [] a=new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']--;
            a[t.charAt(i)-'a']++;
        }
        a[t.charAt(s.length())-'a']++;
        for(int i=0;i<26;i++)
        if(a[i]==1)
        return (char)(i+'a');
        return 'a';
    }
}

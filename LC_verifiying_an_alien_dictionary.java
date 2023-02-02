class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int []a=new int[26];
        for(int i=0;i<26;i++)
        a[order.charAt(i)-'a']=i;
        for(int i=0;i<words.length-1;i++)
        for(int j=0;j<words[i].length();j++){
            if(j==words[i+1].length()) return false;
            if(a[words[i].charAt(j)-'a']<a[words[i+1].charAt(j)-'a']) break;
            else if(a[words[i].charAt(j)-'a']>a[words[i+1].charAt(j)-'a']) return false;
        }
        return true;
    }
}

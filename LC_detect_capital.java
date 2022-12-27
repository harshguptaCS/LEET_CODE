class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0,s=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z') c++;
            else s++;
        }
        if(c==1&&(word.charAt(0)>='A'&&word.charAt(0)<='Z')) return true;
        else if(c==0) return true;
        else if(c==word.length()) return true;
        return false;
    }
}

class Solution {
    public int addMinimum(String word) {
        int ans=0;
        char p='c',n='a';
        for(char ch:word.toCharArray()){
            if(ch==p) ans+=2;
            else if(ch!=n) ans+=1;
            p=ch;
            n=(char)('a'+(p-'a'+1)%3);
        }
        if(word.charAt(word.length()-1)!='c') ans+='c'-word.charAt(word.length()-1);
        return ans;
    }
}

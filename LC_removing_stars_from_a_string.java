class Solution {
    public String removeStars(String s) {
        int x=0;
        char ans[]=new char[s.length()];
        for(char c:s.toCharArray())
        if(c=='*') x--;
        else ans[x++]=c;
        return String.valueOf(ans,0,x);
    }
}

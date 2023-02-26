class Solution {
    public int minAddToMakeValid(String s) {
        int x=0,o=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') o++;
            else c++;
            if(c>o){
                o++;
                x++;
            }
        }
        return x+o-c;
    }
}

class Solution {
    public int countSegments(String s) {
        int x=0;
        if(s.length()==0) return x;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '&&s.charAt(i-1)!=' '){
                x++;
            }
        }
        if(s.charAt(s.length()-1)!=' ') x++;
        return x;
    }
}

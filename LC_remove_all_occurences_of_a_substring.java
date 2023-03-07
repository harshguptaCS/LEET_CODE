class Solution {
    public String removeOccurrences(String s, String part) {
        int l=0;
        while(l!=s.length()){
            l=s.length();
            s=s.replaceFirst(part,"");
        }
        return s;
    }
}

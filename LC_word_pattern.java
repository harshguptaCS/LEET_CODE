class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] s1=s.split(" ");
        int n=pattern.length(),n2=s1.length;
        if(n!=n2) return false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(pattern.charAt(i)==pattern.charAt(j)){
                    if(!(s1[i].equals(s1[j]))) return false;
                }
                else{
                    if(s1[i].equals(s1[j])) return false;
                }
            }
        }
        return true;
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
        int h1=haystack.length(),h2=needle.length(),fl=0;
        for(int i=0;i<=h1-h2;i++){
            for(int j=0;j<h2;j++){
                fl=0;
                if(haystack.charAt(i+j)==needle.charAt(j)) fl=1;
                else{
                    fl=0;
                    break;
                }
            }
            if(fl==1) return i;
        }
        return -1;
    }
}

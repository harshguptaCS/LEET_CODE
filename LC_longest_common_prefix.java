class Solution {
    public String longestCommonPrefix(String[] strs) {
        int x=strs[0].length(),l=strs.length;
        if(l==1) return strs[0];
        for(int i=1;i<l;i++){
            if(x>strs[i].length()) x=strs[i].length();
            for(int j=0;j<x;j++)
            if(strs[0].charAt(j)!=strs[i].charAt(j)){
                x=j;
                break;
            }
        }
        StringBuilder s= new StringBuilder();
        for(int i=0;i<x;i++)
        s.append(strs[0].charAt(i));
        return s.toString();
    }
}

class Solution {
    public String largestGoodInteger(String num) {
        int ans=-1;
        for(int i=2;i<num.length();i++){
            if(num.charAt(i)==num.charAt(i-1)&&num.charAt(i)==num.charAt(i-2))
            ans=Math.max(ans,num.charAt(i)-'0');
        }
        if(ans==-1) return "";
        String c=Integer.toString(ans);
        return c+c+c;
    }
}

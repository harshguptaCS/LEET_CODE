class Solution {
    public String maximumOddBinaryNumber(String s) {
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='1') cnt++;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(i<cnt)ans.append(1);
            else ans.append(0);
        }
        ans.append(1);
        return ans.toString();
    }
}

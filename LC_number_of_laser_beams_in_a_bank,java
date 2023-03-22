class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0,a=0,b=0;
        for(String i:bank){
            if(b!=0){
                a=b;
                b=0;
            }
            for(char ch:i.toCharArray())
            if(ch=='1') b++;
            ans+=a*b;
        }
        return ans;
    }
}

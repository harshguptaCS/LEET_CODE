class Solution {
    public String convert(String s, int n) {
        if(n==1) return s;
        StringBuilder s2=new StringBuilder();
        int l=s.length(),r=2*n-2,c;
        for(int i=0;i<n;i++){
            int x=i;
            while(x<l){
                s2.append(s.charAt(x));
                c=x+r-2*i;
                if(c>=l) break;
                if(i==0||i==n-1) x=x+r;
                else{
                    s2.append(s.charAt(c));
                    x=x+r;
                }
            }
        }
        return s2.toString();
    }
}

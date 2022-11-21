class Solution {
    public String addBinary(String a, String b) {
        int n1=a.length(),n2=b.length(),c=0;
        int m= n1>n2?n1:n2;
        int min= n1<n2?n1:n2;
        int []ar=new int[m+1];
        for(int i=1;i<=min;i++){
            if(c+a.charAt(n1-i)+b.charAt(n2-i)-'0'-'0'==1){
                ar[m+1-i]=1;
                c=0;
            }
            else if(c+a.charAt(n1-i)+b.charAt(n2-i)-'0'-'0'==2){
                c=1;
            }
            else if(c+a.charAt(n1-i)+b.charAt(n2-i)-'0'-'0'==3){
                c=1;
                ar[m+1-i]=1;
            }
        }
        String s=n1>n2?a:b;
        for(int i=m-min-1;i>=0;i--){
            if(c+s.charAt(i)-'0'==1){
                ar[i+1]=1;
                c=0;
            }
            else if(c+s.charAt(i)-'0'==2){
                c=1;
            }
        }
        if(c==1) ar[0]=1;
        StringBuilder ans=new StringBuilder();
        for(int i=1-c;i<m+1;i++){
            ans.append(ar[i]);
        }
        return ans.toString();
    }
}

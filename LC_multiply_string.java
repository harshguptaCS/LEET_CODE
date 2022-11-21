class Solution {
    public String multiply(String num1, String num2) {
        int n1=num1.length(),n2=num2.length(),temp,fl=0;
        StringBuilder ans=new StringBuilder();
        int [] ar=new int[n1+n2-1];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                ar[i+j]+=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
        }
        for(int i=n1+n2-2;i>0;i--){
            temp=ar[i]/10;
            ar[i]=ar[i]%10;
            ar[i-1]+=temp;
        }
        for(int i=0;i<=n1+n2-2;i++){
            if(ar[i]!=0||fl==1||i==n1+n2-2){
        		fl=1;
        		ans.append(ar[i]);
            }
        }
		return ans.toString();
    }
}

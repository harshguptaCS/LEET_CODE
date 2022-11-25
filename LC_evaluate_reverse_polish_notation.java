class Solution {
    public int evalRPN(String[] s) {
        int l=s.length,p=0;
        int[]a=new int[l/2+1];
        for(int i=0;i<l;i++){
            if(s[i].charAt(0)=='+'){
                a[p-2]=a[p-2]+a[p-1];
                p=p-1;
            }
            else if(s[i].charAt(0)=='-'&&s[i].length()==1){
                a[p-2]=a[p-2]-a[p-1];
                p=p-1;
            }
            else if(s[i].charAt(0)=='*'){
                a[p-2]=a[p-2]*a[p-1];
                p=p-1;
            }
            else if(s[i].charAt(0)=='/'){
                a[p-2]=a[p-2]/a[p-1];
                p=p-1;
            }
            else{
                a[p]=Integer.parseInt(s[i]);
                p++;
            }
        }
        return a[0];
    }
}

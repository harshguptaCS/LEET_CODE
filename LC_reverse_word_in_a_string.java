class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        for(int i=0,j=0;j<=n;j++){
            if(j==n||ch[j]==' '){
                reverse(ch,i,j-1);
                i=j+1;
            }
        }
        return new String(ch);
    }
    public void reverse(char[]ch,int i,int j){
        while(i<j){
            char tmp=ch[i];
            ch[i]=ch[j];
            ch[j]=tmp;
            i++;
            j--;
        }
    }
}

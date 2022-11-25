class Solution {
    public boolean isValidSudoku(char[][] s) {
        int []a=new int[9];
        int []b=new int[9];
        for(int i=0;i<9;i++){
            a=new int[9];
            b=new int[9];
            for(int j=0;j<9;j++){
                if(s[i][j]!='.'){
                if(a[s[i][j]-'1']==0) a[s[i][j]-'1']++;
                else return false;}
                if(s[j][i]=='.') continue;
                if(b[s[j][i]-'1']==0) b[s[j][i]-'1']++;
                else return false;
            }
        }
        for (int m=0;m<9;m+=3)
        for (int n=0;n<9;n+=3){
            a=new int[9];
            for (int i=m;i<m+3;i++)
            for (int j=n;j<n+3;j++)
            if(s[i][j]!='.'){
                if(a[s[i][j]-'1']==0) a[s[i][j]-'1']++;
                else return false;}
        }
        return true;
    }
}

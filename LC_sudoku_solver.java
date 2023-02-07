class Solution {
    public void solveSudoku(char[][] board) {
        harsh(board,0,0);
    }
    int fl=0;
    public void harsh(char grid[][],int i,int j){
        if(i==8&&j==9){
            fl=1;
            return;
        }
        if(j==9){
            j=0;
            i++;
        }
        if(grid[i][j]!='.'){
            harsh(grid,i,j+1);
            return;
        }
        for(int k=1;k<=9;k++){
            if(row(grid,i,k+'0')&&col(grid,j,k+'0')&&mat(grid,i,j,k+'0')){
                grid[i][j]=(char)(k+'0');
                harsh(grid,i,j+1);
                if(fl==1) break;
            }
        }
        if(fl==0) grid[i][j]='.';
    }
    public boolean row(char grid[][],int r,int k){
        for(int i=0;i<9;i++)
        if(grid[r][i]==k) return false;
        return true;
    }
    public boolean col(char grid[][],int c,int k){
        for(int i=0;i<9;i++)
        if(grid[i][c]==k) return false;
        return true;
    }
    public boolean mat(char grid[][],int r,int c,int k){
        for(int i=r/3*3;i<r/3*3+3;i++)
        for(int j=c/3*3;j<c/3*3+3;j++)
        if(grid[i][j]==k) return false;
        return true;
    }
}

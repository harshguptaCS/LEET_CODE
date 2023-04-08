class Solution {
    public int countBattleships(char[][] board) {
        int ans=0;
        for(int i=0;i<board.length;i++)
        for(int j=0;j<board[0].length;j++)
        if(board[i][j]=='X'){
            harsh(board,i,j);
            ans++;
        }
        return ans;
    }
    int ans=0;
    public void harsh(char board[][],int i,int j){
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]=='.') return;
        board[i][j]='.';
        harsh(board,i,j+1);
        harsh(board,i,j-1);
        harsh(board,i+1,j);
        harsh(board,i-1,j);
    }
}

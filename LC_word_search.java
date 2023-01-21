class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
	    for(int j=0;j<board[0].length;j++)
	    if(board[i][j]==word.charAt(0)){
	        board[i][j]=(char)(board[i][j]+64);
		    harsh(board,word,i,j,1);
		    if(fl==1) break;
    		board[i][j]=(char)(board[i][j]-64);
	    }
	    if(fl==1) return true;
	    return false;
	}
	int fl=0;
	public void harsh(char [][]board,String word,int i,int j,int in){
	    if(in==word.length()){
	        fl=1;
	        return;
	    }
	    if((i!=0)&&(board[i-1][j]==word.charAt(in))){
	        board[i-1][j]=(char)(board[i-1][j]+64);
	        harsh(board,word,i-1,j,in+1);
	        board[i-1][j]=(char)(board[i-1][j]-64);
	    }
	    if(fl==1) return;
	    if((j!=board[0].length-1)&&(board[i][j+1]==word.charAt(in))){
	        board[i][j+1]=(char)(board[i][j+1]+64);
	        harsh(board,word,i,j+1,in+1);
	        board[i][j+1]=(char)(board[i][j+1]-64);
	    }
	    if(fl==1) return;
	    if((i!=board.length-1)&&(board[i+1][j]==word.charAt(in))){
	        board[i+1][j]=(char)(board[i+1][j]+64);
	        harsh(board,word,i+1,j,in+1);
	        board[i+1][j]=(char)(board[i+1][j]-64);
	    }
	    if(fl==1) return;
	    if((j!=0)&&(board[i][j-1]==word.charAt(in))){
	        board[i][j-1]=(char)(board[i][j-1]+64);
	        harsh(board,word,i,j-1,in+1);
	        board[i][j-1]=(char)(board[i][j-1]-64);
	    }
	}
}

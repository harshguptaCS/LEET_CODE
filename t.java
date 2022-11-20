import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[][]matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
	    int r=matrix.length,c=matrix[0].length;
        ArrayList<Integer> row=new ArrayList<Integer>();
        ArrayList<Integer> col=new ArrayList<Integer>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        int t=row.get(0);
        for(int i=0;i<row.size();i++){
            if(row.get(i)!=t||i==0){
                t=row.get(i);
                for(int j=0;j<c;j++)
                    matrix[row.get(i)][j]=0;
            }    
        }     
        
	}
}

class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        ArrayList<Integer> row=new ArrayList<Integer>();
        ArrayList<Integer> col=new ArrayList<Integer>();
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
        if(row.size()!=0){
            int t=row.get(0);
            for(int i=0;i<row.size();i++)
                if(row.get(i)!=t||i==0){
                    t=row.get(i);
                    for(int j=0;j<c;j++)
                        matrix[row.get(i)][j]=0;
                }
            col.sort(Comparator.naturalOrder());
            int s=col.get(0);
            for(int i=0;i<col.size();i++)
                if(col.get(i)!=t||i==0){
                    t=col.get(i);
                    for(int j=0;j<r;j++)
                        matrix[j][col.get(i)]=0;
                }
        }
    }
}

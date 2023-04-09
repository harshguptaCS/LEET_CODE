class Solution {
    public int[][] diagonalSort(int[][] mat) {
        for(int i=0;i<mat.length-1;i++)
        harsh(mat,i,0);
        for(int j=1;j<mat[0].length;j++)
        harsh(mat,0,j);
        return mat;
    }
    public void harsh(int[][] mat,int i,int j){
        int x=i,y=j;
        List<Integer> al=new ArrayList<>();
        while(i<mat.length&&j<mat[0].length){
            al.add(mat[i][j]);
            i++;
            j++;
        }
        Collections.sort(al);
        for(int t:al)
        mat[x++][y++]=t;
    }
}

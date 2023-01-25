class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al1=new ArrayList<>();
        List<Integer> al2=new ArrayList<>();
        al1.add(1);
        al2=new ArrayList<>(al1);
        if(rowIndex==0) return al1;
        for(int i=2;i<=rowIndex+1;i++){
            for(int j=1;j<i-1;j++)
            al1.set(j,(al2.get(j-1)+al2.get(j)));
            al1.add(1);
            al2=new ArrayList<>(al1);
        }
        return al2;
    }
}

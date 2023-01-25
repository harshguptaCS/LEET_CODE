class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        al.add(1);
        l.add(new ArrayList<>(al));
        if(numRows==1) return l;
        for(int i=2;i<=numRows;i++){
            for(int j=1;j<i-1;j++)
            al.set(j,(l.get(l.size()-1)).get(j-1)+(l.get(l.size()-1)).get(j));
            al.add(1);
            l.add(new ArrayList<>(al));
        }
        return l;
    }
}

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<Integer> size =new ArrayList<>();
        List<List<Integer>> l=new ArrayList<>();
        int c=0;
        for(int x:groupSizes){
            int fl=0;
            for(int i=0;i<size.size();i++){
                if(size.get(i)==x&&l.get(i).size()<x){
                    l.get(i).add(c);
                    fl=1;
                    break;
                }
            }
            if(fl==0){
                l.add(new ArrayList<>());
                size.add(x);
                l.get(l.size()-1).add(c);
            }
            c++;
        }
        return l;
    }
}

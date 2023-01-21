class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        harsh(0,n,k,al,l);
        return l;
    }
    public void harsh(int i,int n,int k,List<Integer> al,List<List<Integer>> l){
        if(k==0){
            l.add(new ArrayList<>(al));
            return;
        }
        for(int j=i+1;j<=n;j++){
            al.add(j);
            harsh(j,n,k-1,al,l);
            al.remove(al.size()-1);
        }
    }
}

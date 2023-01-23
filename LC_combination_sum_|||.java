class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l=new ArrayList<>();
        harsh(n,k,l,new ArrayList<>(),0,0);
        return l;
    }
    public void harsh(int n,int k,List<List<Integer>> l,List<Integer> al,int i,int s){
        if(s==n&&al.size()==k){
            l.add(new ArrayList<>(al));
            return;
        }
        for(int j=i+1;j<=9;j++){
            if(al.size()<k&&s+j<=n){
                al.add(j);
                harsh(n,k,l,al,j,s+j);
                al.remove(al.size()-1);
            }
        }
    }
}

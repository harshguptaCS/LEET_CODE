class Solution {
    public List<List<String>> solveNQueens(int n) {
        for(int i=0;i<n;i++) s.append('.');
        temp.add(0);
        temp.add(0);
	    harsh(n,0,new ArrayList<>());
	    return l;
	}
	StringBuilder s=new StringBuilder();
	List<Integer> temp=new ArrayList<>();
	List<Integer> col=new ArrayList<>();
	List<List<Integer>> dia=new ArrayList<>();
	List<List<String>> l=new ArrayList<>();
	public void harsh(int n,int r,List<String> al){
	    if(al.size()==n){
	        l.add(new ArrayList<>(al));
	        return;
	    }
	    for(int i=0;i<n;i++)
        if(column(i)&&diagonal(r,i)){
            col.add(i);
            temp.set(0,r);
            temp.set(1,i);
            dia.add(new ArrayList<>(temp));
            s.setCharAt(i,'Q');
            al.add(s.toString());
            s.setCharAt(i,'.');
            harsh(n,r+1,al);
            al.remove(al.size()-1);
            col.remove(col.size()-1);
            dia.remove(dia.size()-1);
        }
	}
	public boolean column(int c){
	    for(int i=0;i<col.size();i++)if(c==col.get(i)) return false;
	    return true;
	}
	public boolean diagonal(int r,int c){
	    for(int i=0;i<dia.size();i++)
	    if(Math.abs(r-(dia.get(i)).get(0))==Math.abs(c-(dia.get(i)).get(1))) return false;
	    return true;
	}
}

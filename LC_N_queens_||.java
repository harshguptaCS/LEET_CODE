class Solution {
    public int totalNQueens(int n) {
        temp.add(0);
	    temp.add(0);
	    harsh(n,0,0);
	    return count;
	}
	int count=0;
	List<Integer> temp=new ArrayList<>();
	List<Integer> col=new ArrayList<>();
	List<List<Integer>> dia=new ArrayList<>();
	public void harsh(int n,int r,int m){
	    if(m==n){
	        count++;
	        return;
	    }
	    for(int i=0;i<n;i++){
	        if(column(i)&&diagonal(r,i)){
	            col.add(i);
	            temp.set(0,r);
	            temp.set(1,i);
	            dia.add(new ArrayList<>(temp));
	            harsh(n,r+1,m+1);
	            col.remove(col.size()-1);
	            dia.remove(dia.size()-1);
	        }
	    }
	}
	public boolean column(int c){
	    for(int i=0;i<col.size();i++){
	        if(c==col.get(i)) return false;
	    }
	    return true;
	}
	public boolean diagonal(int r,int c){
	    for(int i=0;i<dia.size();i++){
	        if(Math.abs(r-(dia.get(i)).get(0))==Math.abs(c-(dia.get(i)).get(1))) return false;
	    }
	    return true;
	}
}

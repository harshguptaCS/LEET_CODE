class Solution {
    public List<Integer> lexicalOrder(int n) {
        harsh(0,n);
        return l;
	}
    List<Integer> l=new ArrayList<>();
	public void harsh(int x,int n)
    {
        if(x>n) return;
        if(x!=0) l.add(x);
        int i=0;
        if(x==0) i=1;
        for(;i<=9;i++){
            harsh(x*10+i,n);
        }
    }
}

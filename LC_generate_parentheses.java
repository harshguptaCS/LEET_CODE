class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        harsh(l,n,1,0,"(");
        return l;
	}
	public static void harsh(List<String> l,int n,int o,int c,String s){
	    if(o==n&&c==n){
	        l.add(s);
	        return;
	    }
	    if(o<n){
	        harsh(l,n,o+1,c,s+"(");
	    }
	    if(c<n&&c<o){
	        harsh(l,n,o,c+1,s+")");
	    }
	}
}

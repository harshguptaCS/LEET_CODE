class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> l=new ArrayList<List<Integer>>();
	    ArrayList<Integer> t=new ArrayList<Integer>();
        int n=graph.length;
        t.add(0);
        harsh(0,t,graph,n-1,l);
        return l;
	}
	public static void harsh(int in,ArrayList<Integer> t,int [][] graph,int f,List<List<Integer>> l){
	    if(in==f){
	        l.add(new ArrayList<Integer>(t));
	        return;
	    }
	    for(int i=0;i<graph[in].length;i++){
	        t.add(graph[in][i]);
	        harsh(graph[in][i],t,graph,f,l);
	        t.remove(t.size()-1);
	    }
    }
}

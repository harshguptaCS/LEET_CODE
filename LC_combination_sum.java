class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> al=new ArrayList<>();
		harsh(candidates,al,0,0,target);
		return l;
	}
    List<List<Integer>> l=new ArrayList<>();
	public void harsh(int [] candidates,List<Integer> al,int x,int sum,int target){
        if(sum==target){
            l.add(new ArrayList<>(al));
	        return;
	    }
	    if(sum>target) return;
	    for(int i=x;i<candidates.length;i++){
	        al.add(candidates[i]);
	        harsh(candidates,al,i,sum+candidates[i],target);
	        al.remove(al.size()-1);
	    }
	}
}

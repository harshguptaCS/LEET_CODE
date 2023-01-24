class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
		harsh(candidates,al,l,-1,0,target);
		return l;
	}
	public void harsh(int [] candidates,List<Integer> al,List<List<Integer>> l,int x,int sum,int target){
        if(sum==target){
            l.add(new ArrayList<>(al));
	        return;
	    }
	    for(int i=x+1;i<candidates.length;i++){
	        if(sum+candidates[i]>target) return;
	        if(i>x+1&&(candidates[i]==candidates[i-1])) continue;
            al.add(candidates[i]);
	        harsh(candidates,al,l,i,sum+candidates[i],target);
	        al.remove(al.size()-1);
	    }
	}
}

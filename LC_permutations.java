class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
		List<Integer> al=new ArrayList<>();
		harsh(l,nums,al);
		return l;
	}
	public void harsh(List<List<Integer>> l,int [] nums,List<Integer> al){
	    if(al.size()==nums.length){
	        l.add(new ArrayList<>(al));
	        return;
	    }
	    for(int i=0;i<nums.length;i++){
	        if(al.contains(nums[i])) continue;
	        al.add(nums[i]);
	        harsh(l,nums,al);
	        al.remove(al.size()-1);
	    }
	}
}

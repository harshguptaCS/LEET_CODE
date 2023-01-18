class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
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
            int fl=0;
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                    fl=1;
                    break;
                }
            }
            if(fl==1) continue;
	        if(nums[i]==11) continue;
	        int x=nums[i];
	        al.add(x);
	        nums[i]=11;
	        harsh(l,nums,al);
	        nums[i]=x;
	        al.remove(al.size()-1);
	    }
	}
}

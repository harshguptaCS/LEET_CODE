class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<List<Integer>>();
		l.add(new ArrayList<Integer>());
		for(int i=0;i<nums.length;i++){
		    int n=l.size();
		    for(int j=0;j<n;j++){
		        List<Integer> l2=new ArrayList<>(l.get(j));
		        l2.add(nums[i]);
		        l.add(l2);
		    }
		}
        return l;
    }
}

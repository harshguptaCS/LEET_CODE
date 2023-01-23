class Solution {
    public List<List<Integer>> subsets(int[] nums) {
		harsh(nums,new ArrayList<>(),0);
        return l;
    }
    List<List<Integer>> l=new ArrayList<List<Integer>>();
    public void harsh(int nums[],List<Integer> al,int i){
        if(i==nums.length){
            l.add(new ArrayList<>(al));
            return;
        }
        harsh(nums,al,i+1);
        al.add(nums[i]);
        harsh(nums,al,i+1);
        al.remove(al.size()-1);
    }
}

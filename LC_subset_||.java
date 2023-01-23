class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        harsh(nums,new ArrayList<>(),0,0);
        return l;
    }
    List<List<Integer>> l=new ArrayList<List<Integer>>();
    public void harsh(int nums[],List<Integer> al,int i,int x){
        if(i>=nums.length){
            l.add(new ArrayList<>(al));
            return;
        }
        int fl=0;
        for(int j=0;j<i;j++)
        if(nums[j]==nums[i]){
            fl=1;
            break;
        }
        harsh(nums,al,i+1,0);
        if(fl==0||x==1){
            al.add(nums[i]);
            harsh(nums,al,i+1,1);
            al.remove(al.size()-1);
        }
    }
}

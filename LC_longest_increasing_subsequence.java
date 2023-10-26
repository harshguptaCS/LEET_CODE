class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> al=new ArrayList<>();
        al.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>al.get(al.size()-1)) al.add(nums[i]);
            else{
                int in=binsrch(al,nums[i]);
                al.set(in,nums[i]);
            }
        }
        return al.size();
    }
    public int binsrch(List<Integer> al,int x){
        int l=0,r=al.size()-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(al.get(m)>=x) r=m;
            else l=m+1;
        }
        return l;
    }
}

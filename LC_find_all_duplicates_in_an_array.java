class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
        for(int i:nums){
            int p=1;
            if(i<0) p=-1;
            if(nums[p*i-1]<0) l.add(i*p);
            else nums[p*i-1]*=-1;
        }
        return l;
    }
}

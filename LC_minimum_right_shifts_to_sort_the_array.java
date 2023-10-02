class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        if(nums.size()==1) return 0;
        int in=nums.size();
        for(int i=0;i<nums.size()-1;i++)
            if(nums.get(i)>nums.get(i+1)){
                in=i+1;
                break;
            }
        if(in==nums.size()) return 0;
        for(int i=in;i<nums.size()-1;i++)
            if(nums.get(i)>nums.get(i+1)||nums.get(i)>nums.get(0))
                return -1;
        if(nums.get(nums.size()-1)>nums.get(0)) return -1;
        return nums.size()-in;
    }
}

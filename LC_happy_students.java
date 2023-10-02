class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int ans=0,sum=0;
        for(int i=0;i<nums.size()-1;i++){
            sum=i+1;
            if(sum>nums.get(i)&&sum<nums.get(i+1))ans++;
        }
        if(nums.get(0)!=0)ans++;
        if(nums.get(nums.size()-1)<nums.size())ans++;
        return ans;
    }
}

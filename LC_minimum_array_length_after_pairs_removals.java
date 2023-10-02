class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n=nums.size(),i=0,j=(n+1)/2,ans=0;
        if(nums.size()%2==1) ans=1;
        while(i<n/2&&j<n){
            if(nums.get(i)==nums.get(j))ans+=2;
            i++;
            j++;
        }
        return ans;
    }
}

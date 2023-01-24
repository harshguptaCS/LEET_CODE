class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int s=0,c=0;
        for(int x:nums)
        if(x%2==0) s+=x;
        int a[]=new int[queries.length];
        for(int querie[]:queries){
            if(nums[querie[1]]%2==0) s-=nums[querie[1]];
            nums[querie[1]]+=querie[0];
            if(nums[querie[1]]%2==0) s+=nums[querie[1]];
            a[c++]=s;
        }
        return a;
    }
}

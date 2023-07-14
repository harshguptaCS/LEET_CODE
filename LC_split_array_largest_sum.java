class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0,r=0,m;
        for(int x:nums){
            l=Math.max(l,x);
            r+=x;
        }
        while(l<r){
            m=l+(r-l)/2;
            if(harsh(nums,m,k)) r=m;
            else l=m+1;
        }
        return l;
    }
    public boolean harsh(int nums[],int m,int k){
	    int sum=0;
	    for(int i=0;i<nums.length;i++){
	        sum+=nums[i];
	        if(sum>m){
	            k--;
	            sum=nums[i];
	        }
	        if(k==0) return false;
	    }
	    return true;
	}
}

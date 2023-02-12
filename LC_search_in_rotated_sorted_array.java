class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length,l=0,r=n-1,k;
	    while(l<r){
	        int m=(r+l)/2;
	        if(nums[m]>nums[r]) l=m+1;
	        else if(nums[m]<nums[r]) r=m;
	    }
	    k=l;l=0;r=n-1;
	    while(l<=r){
	        int m=(r+l)/2;
	        if(nums[(m+k)%n]<target) l=m+1;
	        else if(nums[(m+k)%n]>target) r=m-1;
	        else return (m+k)%n;
	    }
	    return -1;
    }
}

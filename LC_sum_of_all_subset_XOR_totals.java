class Solution {
    public int subsetXORSum(int[] nums) {
        harsh(nums,0,0);
        return s;
    }
    int s=0;
	public void harsh(int nums[],int i,int x){
	    if(i==nums.length){
	        s+=x;
	        return;
	    }
	    harsh(nums,i+1,x);
	    harsh(nums,i+1,x^nums[i]);
	}
}

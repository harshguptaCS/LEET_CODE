class Solution {
    public int countMaxOrSubsets(int[] nums) {
        harsh(nums,0,0);
        return c;
    }
    int c=0,s=0;
	public void harsh(int nums[],int i,int o){
	    if(i==nums.length){
	        if(s==0||o>s){
	            s=o;
	            c=0;
	        }
	        if(s==o)c++;
	        return;
	    }
	    harsh(nums,i+1,o);
	    harsh(nums,i+1,o|nums[i]);
	}
}

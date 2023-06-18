class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2],c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
		if((i==0||nums[i]!=nums[i-1])&&(i==nums.length-1||nums[i]!=nums[i+1]))
        arr[c++]=nums[i];
        return arr;
    }
}

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] a=new int[nums.length];
        int l=0,r=0;
        for(int i=0;i<nums.length/2;i++){
            for(int j=l;j<nums.length;j++)
            if(nums[j]>0){
                a[2*i]=nums[j];
                l=j+1;
                break;
            }
            for(int j=r;j<nums.length;j++)
            if(nums[j]<0){
                a[2*i+1]=nums[j];
                r=j+1;
                break;
            }
        }
        return a;
    }
}

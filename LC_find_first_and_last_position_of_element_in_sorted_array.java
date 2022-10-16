class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ar={-1,-1};
        int a=nums.length;
        for(int i=0;i<a;i++){
            if(ar[0]==-1 && nums[i]==target){
                ar[0]=i;
                while(i!=a&&nums[i]==target){
                    ar[1]=i;
                    i++;
                }
                break;
            }    
        }
        return ar;
    }
}

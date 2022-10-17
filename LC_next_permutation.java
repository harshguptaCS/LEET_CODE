class Solution {
    public void nextPermutation(int[] nums) {
        int a=nums.length,m=nums[a-1],t,fl=0;
        for(int i=a-2;i>=0;i--){
            if(nums[i]<m){
                int min=nums[i+1],in=i+1;
                for(int j=i+2;j<a;j++){
                    if(min>nums[j]&&nums[j]>nums[i]){
                        min=nums[j];
                        in=j;
                    }
                }
                t=nums[in];
                nums[in]=nums[i];
                nums[i]=t;
                for (int k=i+1;k<a;k++) {
                    for (int j=k+1;j<a;j++) {
                        int temp;
                        if (nums[j]<nums[k]) {
                            temp=nums[k];
                            nums[k]=nums[j];
                            nums[j]=temp;
                        }
                    }
                }
                fl=1;
                break;
            }    
            else
                m=nums[i];
        }
        if(fl==0){
            for(int i=0;i<=a/2-1;i++){
                t=nums[i];
                nums[i]=nums[a-i-1];
                nums[a-i-1]=t;
            }
        }
    }
}

class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n=nums.length,ans=1;
        int a[]=new int[n*2];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
            a[n+i]=rev(nums[i]);
        }
        Arrays.sort(a);
        for(int i=1;i<2*n;i++)
        if(a[i]!=a[i-1]) ans++;
        return ans;
    }
    public int rev(int x){
        int r=0;
        while(x!=0){
            r=r*10+x%10;
            x=x/10;
        }
        return r;
    }
}

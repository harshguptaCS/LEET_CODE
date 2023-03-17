class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x=al.size(),t=nums[i];
            while(t>0){
                al.add(x,t%10);
                t/=10;
            }
        }
        int arr[]=new int[al.size()];
        int c=0;
        for(int i:al)
        arr[c++]=i;
        return arr;
    }
}

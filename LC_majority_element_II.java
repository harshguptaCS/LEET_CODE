class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0,e1=0,e2=0;
        for(int i:nums){
            if(c1==0&&e2!=i){
                c1=1;
                e1=i;
            }
            else if(c2==0&&e1!=i){
                c2=1;
                e2=i;
            }
            else if(i==e1) c1++;
            else if(i==e2) c2++;
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> al=new ArrayList<>();
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++){
            if(e1==nums[i]) c1++;
            else if(e2==nums[i]) c2++;
        }
        if(c1>nums.length/3) al.add(e1);
        if(c2>nums.length/3) al.add(e2);
        return al;
    }
}

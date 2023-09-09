class Solution {
    public int combinationSum4(int[] nums, int target) {
        int comb[]=new int[target+1];
        comb[0]=1;
        for(int i=1;i<=target;i++){
            for(int num:nums){
                if(num<=i) comb[i]+=comb[i-num];
            }
        }
        return comb[target];
    }
}

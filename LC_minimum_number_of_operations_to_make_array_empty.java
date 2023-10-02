class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.putIfAbsent(i,0);
            map.put(i,map.get(i)+1);
        }
        int ans=0;
        for(int k:map.keySet()){
            int d=map.get(k);
            if(d==1) return -1;
            if(d%3==0) ans+=d/3;
            else ans+=d/3+1;
        }
        return ans;
    }
}

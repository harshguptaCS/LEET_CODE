class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums) set.add(i);
        int ans=0,s=0;
        for(int i:nums){
            if(!set.contains(i)) continue;
            s=1;
            int x=i;
            set.remove(i);
            while(set.contains(--x)){
                s++;
                set.remove(x);
            }
            while(set.contains(++i)){
                s++;
                set.remove(i);
            }
            ans=Math.max(ans,s);
        }
        return ans;
    }
}

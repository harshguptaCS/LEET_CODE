class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans=0,n=piles.length-2;
        for(int i=0;i<piles.length/3;i++){
            ans+=piles[n];
            n-=2;
        }
        return ans;
    }
}

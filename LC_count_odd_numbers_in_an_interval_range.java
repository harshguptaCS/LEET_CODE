class Solution {
    public int countOdds(int low, int high) {
        if(high<low) return 0;
        int ans=(high-low)/2;
        if(low%2==1||high%2==1) ans++;
        return ans;
    }
}

class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans=0,i=1,c=capacity;
        for(int x:plants){
            if(c<x){
                ans+=2*i-1;
                c=capacity;
            }
            else ans++;
            c-=x;
            i++;
        }
        return ans;
    }
}

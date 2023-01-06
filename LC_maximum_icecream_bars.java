class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int x=0,s=0;
        for(int i=0;i<costs.length;i++){
            s+=costs[i];
            if(s>coins) break;
            x++;
        }
        return x;
    }
}

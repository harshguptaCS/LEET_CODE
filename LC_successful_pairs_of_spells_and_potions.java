class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            double x=Math.ceil(success/(double)spells[i]);
            int l=0,r=potions.length-1;
            while(l<=r){
                int m=l+(r-l)/2;
                if(potions[m]<x) l=m+1;
                else r=m-1;
            }
            spells[i]= potions.length-l;
        }
        return spells;
    }
}

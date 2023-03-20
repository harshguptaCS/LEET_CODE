class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(n==0) break;
            if(flowerbed[i]==1) continue;
            if((i==0||flowerbed[i-1]==0)&&(i==flowerbed.length-1||flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
                i++;
            }
        }
        return n==0;
    }
}

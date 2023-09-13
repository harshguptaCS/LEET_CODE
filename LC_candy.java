class Solution {
    public int candy(int[] ratings) {
        int min[]=new int[ratings.length],ans=0;
        Arrays.fill(min,1);
        for(int i=1;i<min.length;i++){
            if(ratings[i]>ratings[i-1]) 
            min[i]=min[i-1]+1;
        }
        for(int i=min.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
            if(min[i]<=min[i+1])
            min[i]=min[i+1]+1;
        }
        for(int x:min)
        ans+=x;
        return ans;
    }
}

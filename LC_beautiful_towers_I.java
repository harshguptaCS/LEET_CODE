class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        long ans=0;
        for(int i=0;i<maxHeights.size();i++){
            int mnl=maxHeights.get(i),mnr=maxHeights.get(i);
            long s1=0,s2=0;
            for(int j=i-1;j>=0;j--){
                if(maxHeights.get(j)<mnl)mnl=maxHeights.get(j);
                s1+=mnl;
            }
            for(int j=i+1;j<maxHeights.size();j++){
                if(maxHeights.get(j)<mnr)mnr=maxHeights.get(j);
                s2+=mnr;
            }
            ans=Math.max(ans,s1+s2+maxHeights.get(i));
        }
        return ans;
    }
}

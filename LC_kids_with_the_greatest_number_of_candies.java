class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m=candies[0];
        for(int i=1;i<candies.length;i++)
        if(candies[i]>m) m=candies[i];
        List<Boolean> l=new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++)
        if(candies[i]+extraCandies>=m) l.add(true);
        else l.add(false);
        return l;
    }
}

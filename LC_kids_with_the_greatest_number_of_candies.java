class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m=candies[0];
        for(int i:candies)
        m=Math.max(m,i);
        List<Boolean> l=new ArrayList<Boolean>();
        for(int i:candies)
        if(i+extraCandies>=m) l.add(true);
        else l.add(false);
        return l;
    }
}

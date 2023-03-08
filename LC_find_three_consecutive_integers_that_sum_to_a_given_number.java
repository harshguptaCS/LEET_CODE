class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0) return new long[0];
        long l[]={num/3-1,num/3,num/3+1};
        return l;
    }
}

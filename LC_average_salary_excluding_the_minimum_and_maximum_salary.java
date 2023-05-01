class Solution {
    public double average(int[] salary) {
        long sum=0;
        int s=salary[0],l=salary[0];
        for(int x:salary){
            sum+=x;
            if(x>l) l=x;
            if(x<s) s=x;
        }
        return (sum-s-l)/(double)(salary.length-2);
    }
}

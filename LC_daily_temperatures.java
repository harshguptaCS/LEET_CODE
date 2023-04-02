class Solution {
    public int[] dailyTemperatures(int[] t) {
        int res[]=new int[t.length];
        for(int i=t.length-2;i>=0;i--)
        for(int j=i+1;j<t.length;j+=res[j]){
            if(t[i]<t[j]){
                res[i]=j-i;
                break;
            }
            if(res[j]==0) break;
        }
        return res;
    }
}

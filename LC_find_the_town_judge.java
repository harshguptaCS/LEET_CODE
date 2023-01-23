class Solution {
    public int findJudge(int n, int[][] trust) {
        int a[]=new int[n];
        for(int x[]:trust){
            a[x[0]-1]--;
            a[x[1]-1]++;
        }
        for(int i=0;i<n;i++)
        if(a[i]==n-1) return i+1;
        return -1;
    }
}

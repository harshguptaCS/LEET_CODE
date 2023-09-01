class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1],i=2,t=2;
        if(n==0) return ans;
        ans[1]=1;
        while(i<=n){
            if(i==t*2) t*=2;
            ans[i]=ans[i-t]+1;
            i++;
        }
        return ans;
    }
}

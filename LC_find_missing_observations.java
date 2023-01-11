class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum=0;
        for(int x:rolls) sum+=x;
        int s=mean*(n+rolls.length)-sum;
        if(s<n||s>n*6) return new int[0];
        int []a=new int[n];
        int x=s/n,y=s%n;
        for(int i=0;i<n;i++){
            if(i<y) a[i]=x+1;
            else a[i]=x;
        }
        return a;
    }
}

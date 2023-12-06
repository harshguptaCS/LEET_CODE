class Solution {
    public int totalMoney(int n) {
        int ans=0,i=1,s=28;
        for(;i<=n/7;i++){
            ans+=s;
            s+=7;
        }
        if(n%7!=0){
            for(int j=n/7+1;j<=n%7+n/7;j++) ans+=j;
        }
        return ans;
    }
}

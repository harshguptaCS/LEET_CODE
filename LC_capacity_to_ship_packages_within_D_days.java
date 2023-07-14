class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0,m;
        for(int x:weights){
            l=Math.max(l,x);
            r+=x;
        }
        while(l<r){
            m=l+(r-l)/2;
            if(harsh(weights,m,days)) r=m;
            else l=m+1;
        }
        return l;
    }
    public boolean harsh(int weights[],int m,int days){
	    int sum=0;
	    for(int i=0;i<weights.length;i++){
	        sum+=weights[i];
	        if(sum>m){
	            days--;
	            sum=weights[i];
	        }
	        if(days==0) return false;
	    }
	    return true;
	}
}

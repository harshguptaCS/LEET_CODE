class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> al=new ArrayList<>();
        for(int i=1;i<10;i++)
        harsh(al,i,n,k,1);
        int a[]=new int[al.size()];
        int c=0;
        for(int x:al){
            a[c++]=x;
        }
        return a;
	}
	public static void harsh(List<Integer> al,int num,int n,int k,int l){
	    if(l==n){
	        al.add(num);
	        return;
	    }
	    if((num%10-k)<10&&(num%10-k)>=0){
	        harsh(al,num*10+Math.abs(num%10-k),n,k,l+1);
	    }
        if(k==0) return;
	    if(num%10+k<10){
	        harsh(al,num*10+num%10+k,n,k,l+1);
	    }
	}
}

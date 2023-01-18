class Solution {
    public String getPermutation(int n, int k) {
        int f=1;
		StringBuilder s=new StringBuilder();
		for(int i=1;i<=n;i++){
		    f*=i;
		    s.append(i);
		}
		String ans=harsh(s,f,k-1,"");
		return ans;
	}
	public static String harsh(StringBuilder s,int f,int k,String ans){
	    f=f/s.length();
	    if(s.length()==1){
	        return ans+s.charAt(0);
	    }
	    ans+=s.charAt(k/f);
	    s.deleteCharAt(k/f);
	    return harsh(s,f,k%f,ans);
	}
}

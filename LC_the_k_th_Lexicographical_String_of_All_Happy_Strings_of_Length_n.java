class Solution {
    public String getHappyString(int n, int k) {
        StringBuilder s=new StringBuilder();
		for(int i=0;i<3;i++){
		    if(fl==1) break;
		    s.append((char)(97+i));
		    harsh(n,k,s);
		    if(fl==0) s.deleteCharAt(s.length()-1);
		}
		if(fl==1) return s.toString();
        return "";
	}
	int count=1,fl=0;
	char HG[][]={{'b','c'},{'a','c'},{'a','b'}};
	public void harsh(int n,int k,StringBuilder s){
	    if(s.length()==n){
	        if(count==k){
	            fl=1;
	            return;
	        }
	        count++;
	        return;
	    }
	    for(int i=0;i<2;i++){
	        if(fl==1) return;
	        s.append(HG[s.charAt(s.length()-1)-'a'][i]);
	        harsh(n,k,s);
	        if(fl==0) s.deleteCharAt(s.length()-1);
	    }
	}
}

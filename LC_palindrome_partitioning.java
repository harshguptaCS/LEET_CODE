class Solution {
    public List<List<String>> partition(String s) {
        harsh(s,new ArrayList<>(),0);
        return l;
	}
    List<List<String>> l=new ArrayList<>();
	public void harsh(String s,List<String> al,int i){
	    if(i==s.length()){
	        l.add(new ArrayList<>(al));
	        return;
	    }
	    for(int j=i;j<s.length();j++)
        if(s.charAt(j)==s.charAt(i)){
            int fl=1;
            if(j-i>2)
            for(int k=i;k<=i+(j-i)/2;k++)
            if(s.charAt(k)!=s.charAt(j-k+i)){
                fl=0;
                break;
            }
            if(fl==1){
                al.add(s.substring(i,j+1));
                harsh(s,al,j+1);
                al.remove(al.size()-1);
            }
        }
	}
}

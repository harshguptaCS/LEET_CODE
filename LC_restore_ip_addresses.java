class Solution {
    public List<String> restoreIpAddresses(String s) {
        StringBuilder s2=new StringBuilder();
		harsh(s,0,0,s2);
        return l;
	}
    List<String> l=new ArrayList<>();
	public void harsh(String s,int i,int m,StringBuilder s2){
	    if(m==4){
	        if(i==s.length()){
	            s2.deleteCharAt(s2.length()-1);
	            l.add(s2.toString());
	            s2.append('.');
	            return;
	        }
	        else return;
	    }
	    if(s.length()-i-1<=(3-m)*3&&s.length()-i-1>=3-m){
	        s2.append(s.charAt(i));
	        s2.append('.');
	        harsh(s,i+1,m+1,s2);
	        s2.deleteCharAt(s2.length()-1);
	        s2.deleteCharAt(s2.length()-1);
	    }
	    if(s.length()-i-2<=(3-m)*3&&s.length()-i-2>=3-m){
	        if(s.charAt(i)=='0') return;
	        s2.append(s.charAt(i));
	        s2.append(s.charAt(i+1));
	        s2.append('.');
	        harsh(s,i+2,m+1,s2);
	        s2.deleteCharAt(s2.length()-1);
	        s2.deleteCharAt(s2.length()-1);
	        s2.deleteCharAt(s2.length()-1);
	    }
	    if(s.length()-i-3<=(3-m)*3&&s.length()-i-3>=3-m){
	        if(Integer.parseInt(s.substring(i,i+3))<256){
	            if(s.charAt(i)=='0') return;
    	        s2.append(s.charAt(i));
    	        s2.append(s.charAt(i+1));
    	        s2.append(s.charAt(i+2));
    	        s2.append('.');
    	        harsh(s,i+3,m+1,s2);
    	        s2.deleteCharAt(s2.length()-1);
    	        s2.deleteCharAt(s2.length()-1);
    	        s2.deleteCharAt(s2.length()-1);
    	        s2.deleteCharAt(s2.length()-1);
	        }
	        else return;
	    }
	}
}

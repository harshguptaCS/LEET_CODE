class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> l=new ArrayList<>();
        harsh(s,0,new StringBuilder(),l);
        return l;
    }
    public void harsh(String s,int i,StringBuilder s2,List<String> l){
        if(i==s.length()){
            l.add(s2.toString());
            return;
        }
        if(s.charAt(i)>='A'&&s.charAt(i)<='z'){
            int t=0;
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z') t=32;
            s2.append((char)(s.charAt(i)+t));
            harsh(s,i+1,s2,l);
            s2.delete(i,s2.length());
            s2.append((char)(s.charAt(i)-32+t));
            harsh(s,i+1,s2,l);
            s2.delete(i,s2.length());
        }
        else{
        s2.append(s.charAt(i));
        harsh(s,i+1,s2,l);
        }
    }
}

class Solution {
    List<String> l=new ArrayList<>();
    String [] s={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return l;
        harsh(digits,0,"");
        return l;
    }
    public void harsh(String digits,int x,String ans){
        if(ans.length()==digits.length()){
            l.add(ans);
            return;
        }
        for(int i=0;i<s[digits.charAt(x)-'2'].length();i++){
            harsh(digits,x+1,ans+s[digits.charAt(x)-'2'].charAt(i));
        }
    }
}

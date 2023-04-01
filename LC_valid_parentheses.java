class Solution {
    public boolean isValid(String h) {
        if(h.length()%2==1) return false;
        Stack<Character> s=new Stack<>();
        for(int i=0;i<h.length();i++){
            if(h.charAt(i)=='('||h.charAt(i)=='{'||h.charAt(i)=='[') s.push(h.charAt(i));
        else{
            if(s.empty()) return false;
            if((h.charAt(i)==')'&&s.peek()=='(')||(h.charAt(i)==']'&&s.peek()=='[')||(h.charAt(i)=='}'&&s.peek()=='{'))
            s.pop();
            else return false;
            }
        }
        return s.empty();
    }
}

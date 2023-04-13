class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s=new Stack();
        int c=0;
        for(int i:pushed){
            s.push(i);
            while(s.size()>0&&s.peek()==popped[c]){
                s.pop();
                c++;
            }
        }
        return s.size()==0;
    }
}

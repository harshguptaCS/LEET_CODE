class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> l=new LinkedList<>();
        if(root==null) return l;
        List<Integer> al=new LinkedList<>();
        Queue<Node> q=new LinkedList<>();
        int n=1;
        q.add(root);
        while(!q.isEmpty()){
            Node f=q.remove();
            al.add(f.val);
            n--;
            for(Node x:f.children){
                q.add(x);
            }
            if(n==0){
                l.add(al);
                al=new LinkedList<>();
                n=q.size();
            }
        }
        return l;
    }
}

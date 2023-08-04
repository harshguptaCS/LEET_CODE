class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int n=1;
        while(!q.isEmpty()){
            Node front=q.remove();
            n--;
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
            if(n==0){
                front.next=null;
                n=q.size();
            }
            else front.next=q.peek();
        }
        return root;
    }
}

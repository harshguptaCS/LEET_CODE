class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        harsh(root);
        return root;
    }
    public void harsh(Node root){
        if(root.left==null) return;
        Node node=root;
        while(node!=null){
            node.left.next=node.right;
            if(node.next!=null) node.right.next=node.next.left;
            node=node.next;
        }
        harsh(root.left);
    }
}

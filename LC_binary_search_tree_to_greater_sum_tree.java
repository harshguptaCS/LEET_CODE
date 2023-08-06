class Solution {
    public TreeNode bstToGst(TreeNode root) {
        harsh(root);
        return root;
    }
    int x=0;
    public void harsh(TreeNode root){
        if(root==null) return;
        harsh(root.right);
        root.val=root.val+x;
        x=root.val;
        harsh(root.left);
    }
}

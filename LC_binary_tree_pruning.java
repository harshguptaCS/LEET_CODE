class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(harsh(root)) return root;
        return null;
    }
    public boolean harsh(TreeNode root){
        if(root==null) return false;
        boolean lft=harsh(root.left);
        boolean rgt=harsh(root.right);
        if(!lft) root.left=null;
        if(!rgt) root.right=null;
        if(root.val==1) return true;
        return lft||rgt;
    }
}

class Solution {
    public void flatten(TreeNode root) {
        Harsh(root);
    }
    public TreeNode Harsh(TreeNode root){
        if(root==null) return null;
        TreeNode left=root.left,right=root.right,la=root,lst=root;
        if(left!=null){
            la=Harsh(root.left);
            root.right=left;
            la.right=right;
            root.left=null;
        }
        if(right!=null) lst=Harsh(right);
        else return la;
        return lst;
    }
}

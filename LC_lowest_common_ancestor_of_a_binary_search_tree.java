class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p||root==q) return root;
        if(root.left==null&&root.right==null) return null;
        TreeNode lst=lowestCommonAncestor(root.left,p,q);
        TreeNode rst=lowestCommonAncestor(root.right,p,q);
        if(lst==null)return rst;
        else if(rst==null)return lst;
        else return root;
    }
}

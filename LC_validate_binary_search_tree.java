class Solution {
    public boolean isValidBST(TreeNode root) {
        return harsh(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    public boolean harsh(TreeNode root,long mx,long mn){
        if(root==null) return true;
        if(root.val>=mx||root.val<=mn) return false;
        return harsh(root.left,root.val,mn)&&harsh(root.right,mx,root.val);
    }
}

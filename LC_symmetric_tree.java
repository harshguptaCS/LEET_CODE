class Solution {
    public boolean isSymmetric(TreeNode root) {
        return equal(root.left,root.right);
    }
    public boolean equal(TreeNode fst,TreeNode snd){
        if(fst==null&&snd==null) return true;
        if(fst==null||snd==null) return false;
        if(fst.val!=snd.val) return false;
        return equal(fst.left,snd.right)&&equal(fst.right,snd.left);
    }
}

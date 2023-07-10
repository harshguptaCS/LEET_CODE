class Solution {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        harsh(root,1);
        return m;
    }
    int m=-1;
    public void harsh(TreeNode root,int l){
        if(root.left==null&&root.right==null){
            if(m==-1) m=l;
            else m=Math.min(m,l);
            return;
        }
        if(m!=-1&&l>=m) return;
        if(root.left!=null) harsh(root.left,l+1);
        if(root.right!=null) harsh(root.right,l+1);
    }
}

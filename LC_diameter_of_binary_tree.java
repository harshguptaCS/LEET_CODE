class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        harsh(root);
        return ans;
    }
    int ans=0;
    public int harsh(TreeNode root){
        if(root==null) return 0;
        int lh=harsh(root.left);
        int rh=harsh(root.right);
        ans=Math.max(ans,lh+rh);
        return Math.max(lh,rh)+1;
    }
}

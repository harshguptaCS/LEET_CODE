class Solution {
    public int longestZigZag(TreeNode root) {
        harsh(root,1,1,0);
        return ans;
    }
    int ans=0;
    public void harsh(TreeNode root,int l,int r,int s){
        ans=Math.max(ans,s);
        if(root.left!=null) harsh(root.left,0,1,s*l+1);
        if(root.right!=null) harsh(root.right,1,0,s*r+1);
    }
}

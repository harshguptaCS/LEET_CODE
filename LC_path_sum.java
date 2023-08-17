class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return harsh(root,targetSum,0);
    }
    public boolean harsh(TreeNode root,int ts,int s){
        if(root==null) return false;
        s+=root.val;
        if(root.left==null&&root.right==null&&s==ts) return true;
        if(harsh(root.left,ts,s)) return true;
        if(harsh(root.right,ts,s)) return true;
        return false;
    }
}

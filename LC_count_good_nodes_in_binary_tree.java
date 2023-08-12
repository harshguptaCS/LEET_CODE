class Solution {
    public int goodNodes(TreeNode root) {
        return harsh(root,Integer.MIN_VALUE);
    }
    public int harsh(TreeNode root,int max){
        if(root==null) return 0;
        max=Math.max(max,root.val);
        int l=harsh(root.left,max);
        int r=harsh(root.right,max);
        if(root.val==max) return l+r+1;
        else return l+r;
    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        BalancedPair bp=harsh(root);
        return bp.ans;
    }
    public BalancedPair harsh(TreeNode node) {
        BalancedPair bp=new BalancedPair();
        if(node==null){
            bp.height=0;
            bp.ans=true;
            return bp;
        }
        BalancedPair l=harsh(node.left);
        BalancedPair r=harsh(node.right);
        bp.height=Math.max(l.height,r.height)+1;
        bp.ans=Math.abs(l.height-r.height)<2&&l.ans&&r.ans;
        return bp;
    }
    private class BalancedPair {
        int height;
        boolean ans;
    }
}

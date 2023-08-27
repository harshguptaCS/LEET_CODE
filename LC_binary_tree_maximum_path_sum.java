class Solution {
    public int maxPathSum(TreeNode root) {
        return mps(root).ans;
    }
    public harsh mps(TreeNode node){
        if(node==null) return new harsh();
        harsh l=mps(node.left);
        harsh r=mps(node.right);
        l.mhs=Math.max(l.mhs,0);
        r.mhs=Math.max(r.mhs,0);
        harsh nh=new harsh();
        nh.mhs=Math.max(l.mhs,r.mhs)+node.val;
        nh.ans=Math.max(Math.max(l.ans,r.ans),l.mhs+r.mhs+node.val);
        return nh;
    }
    class harsh{
        int mhs;
        int ans=Integer.MIN_VALUE;
    }
}

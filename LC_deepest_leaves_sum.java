class Solution {
    public int deepestLeavesSum(TreeNode root) {
        harsh(root,0);
        return s;
    }
    int l=0,s=0;
    public void harsh(TreeNode root,int len){
        if(root.left==null&&root.right==null){
            if(len>l){
                s=0;
                l=len;
            }
            if(len==l) s+=root.val;
        }
        if(root.left!=null) harsh(root.left,len+1);
        if(root.right!=null) harsh(root.right,len+1);
    }
}

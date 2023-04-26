class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        harsh(root,0,0);
        return s;
    }
    int s=0;
    public void harsh(TreeNode root,int p,int g){
        if(g==1) s+=root.val;
        if(root.left!=null) harsh(root.left,1-root.val%2,p);
        if(root.right!=null) harsh(root.right,1-root.val%2,p);
    }
}

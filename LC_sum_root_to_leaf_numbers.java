class Solution {
    public int sumNumbers(TreeNode root) {
        harsh(root,0);
        return sum;
    }
    int sum=0;
    public void harsh(TreeNode root,int s){
        s=s*10+root.val;
        if(root.left==null&&root.right==null){
            sum+=s;
        }
        if(root.left!=null) harsh(root.left,s);
        if(root.right!=null) harsh(root.right,s);
    }
}

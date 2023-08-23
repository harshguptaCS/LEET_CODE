class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode temp=root;
        while(true){
            if(root.val<val){
                if(root.right==null){
                    root.right=new TreeNode(val);
                    break;
                }
                root=root.right;
            }
            else{
                if(root.left==null){
                    root.left=new TreeNode(val);
                    break;
                }
                root=root.left;
            }
        }
        return temp;
    }
}

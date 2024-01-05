class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        harsh(root, res);
        return res;
    }
    public void harsh(TreeNode root, List<Integer> res) {
        if(root==null) return;
        harsh(root.left, res);
        res.add(root.val);
        harsh(root.right, res);
    }
}

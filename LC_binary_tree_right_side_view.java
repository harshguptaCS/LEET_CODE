class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new LinkedList<>();
        harsh(root,l,0);
        return l;
    }
    public void harsh(TreeNode root,List<Integer> l,int d){
        if(root==null) return;
        if(d==l.size()) l.add(root.val);
        harsh(root.right,l,d+1);
        harsh(root.left,l,d+1);
    }
}

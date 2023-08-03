class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l=new LinkedList<>();
        if(root==null) return l;
        List<Integer> al=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        int n=1;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode f=q.remove();
            al.add(f.val);
            n--;
            if(f.left!=null) q.add(f.left);
            if(f.right!=null) q.add(f.right);
            if(n==0){
                l.add(0,al);
                al=new LinkedList<>();
                al.clear();
                n=q.size();
            }
        }
        return l;
    }
}

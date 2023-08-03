class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l=new LinkedList<>();
        if(root==null) return l;
        List<Integer> al=new LinkedList<>();
        Queue<TreeNode> q=new LinkedList<>();
        int n=1;
        boolean fl=true;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode f=q.remove();
            if(fl)al.add(f.val);
            else al.add(0,f.val);
            n--;
            if(f.left!=null) q.add(f.left);
            if(f.right!=null) q.add(f.right);
            if(n==0){
                l.add(al);
                fl=!fl;
                al=new LinkedList<>();
                al.clear();
                n=q.size();
            }
        }
        return l;
    }
}

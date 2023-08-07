class Solution {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<Integer> l=new LinkedList<>();
        if(root==null) return l;
        int m=Integer.MIN_VALUE,n=1;
        while(!q.isEmpty()){
            TreeNode front=q.remove();
            m=Math.max(m,front.val);
            n--;
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
            if(n==0){
                l.add(m);
                m=Integer.MIN_VALUE;
                n=q.size();
            }
        }
        return l;
    }
}

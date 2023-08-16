class Solution {
    public int maxLevelSum(TreeNode root) {
        int n=1,sum=0,l=1,lev=1,mx=Integer.MIN_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode f=q.remove();
            sum+=f.val;
            n--;
            if(f.left!=null) q.add(f.left);
            if(f.right!=null) q.add(f.right);
            if(n==0){
                if(sum>mx){
                    mx=sum;
                    lev=l;
                }
                l++;
                sum=0;
                n=q.size();
            }
        }
        return lev;
    }
}

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int ts) {
        if(root==null) return l;
        harsh(root,ts);
        return l;
    }
    List<List<Integer>> l=new ArrayList<>();
    List<Integer> al=new ArrayList<>();
    public void harsh(TreeNode root,int ts){
        ts-=root.val;
        al.add(root.val);
        if(root.left==null&&root.right==null){
            if(0==ts) l.add(new ArrayList<>(al));
        }
        if(root.left!=null) harsh(root.left,ts);
        if(root.right!=null) harsh(root.right,ts);
        al.remove(al.size()-1);
    }
}

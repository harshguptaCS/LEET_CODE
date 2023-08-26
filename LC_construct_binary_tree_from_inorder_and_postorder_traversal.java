class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        mp.put(inorder[i],i);
        prein=inorder.length-1;
        return harsh(postorder,mp,inorder,0,postorder.length-1);
    }
    int prein;
    public TreeNode harsh(int postorder[],HashMap<Integer,Integer> mp,int inorder[],int l,int r){
        if(l>r) return null;
        TreeNode node=new TreeNode(postorder[prein--]);
        if(l==r) return node;
        int in=mp.get(node.val);
        node.right=harsh(postorder,mp,inorder,in+1,r);
        node.left=harsh(postorder,mp,inorder,l,in-1);
        return node;
    }
}

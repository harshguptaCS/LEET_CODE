class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        mp.put(inorder[i],i);
        return harsh(preorder,mp,inorder,0,preorder.length-1);
    }
    int prein=0;
    public TreeNode harsh(int preorder[],HashMap<Integer,Integer> mp,int inorder[],int l,int r){
        if(l>r) return null;
        TreeNode node=new TreeNode(preorder[prein++]);
        if(l==r) return node;
        int in=mp.get(node.val);
        node.left=harsh(preorder,mp,inorder,l,in-1);
        node.right=harsh(preorder,mp,inorder,in+1,r);
        return node;
    }
}

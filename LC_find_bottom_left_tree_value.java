class Solution {
    public int findBottomLeftValue(TreeNode root) {
        harsh(root,1);
        return ans;
    }
    int ans,he=0;
    public void harsh(TreeNode root,int h){
        if(root==null) return;
        if(root.left==null&&root.right==null){
            if(h>he){
                ans=root.val;
                he=h;
            }
            return;
        }
        harsh(root.left,h+1);
        harsh(root.right,h+1);
    }
}

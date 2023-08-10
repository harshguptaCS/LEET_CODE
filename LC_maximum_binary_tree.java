class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
    public TreeNode construct(int nums[],int l,int r){
        if(l>r) return null;
        int in=max(nums,l,r);
        TreeNode temp=new TreeNode(nums[in]);
        temp.left= construct(nums,l,in-1);
        temp.right= construct(nums,in+1,r);
        return temp;
    }
    public int max(int nums[],int l,int r){
        int in=l;
        for(int i=l;i<=r;i++)
        if(nums[in]<nums[i]) in=i;
        return in;
    }
}

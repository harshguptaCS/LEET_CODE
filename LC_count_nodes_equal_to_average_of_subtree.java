class Solution {
    public int averageOfSubtree(TreeNode root) {
        data k=harsh(root);
        return k.count;
    }
    public data harsh(TreeNode root){
        if(root==null) return new data();
        data left=harsh(root.left);
        data right=harsh(root.right);
        data temp=new data();
        temp.sum=left.sum+right.sum+root.val;
        temp.noc=left.noc+right.noc+1;
        temp.count=left.count+right.count;
        if(temp.sum/temp.noc==root.val) temp.count+=1;
        return temp;
    }
    class data{
        int sum;
        int noc;
        int count;
    }
}

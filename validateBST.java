/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class validateBST{
    public boolean isValidBST(TreeNode root) {
        return validBST(root,Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY);
    }
    public boolean validBST(TreeNode root,double max,double min){
        if(root==null)return true;
        if(root.val<=min||root.val>=max)return false;
        return validBST(root.left,root.val,min)&&validBST(root.right,max,root.val);
    }
}
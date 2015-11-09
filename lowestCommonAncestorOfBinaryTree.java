/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class lowestCommonAncestorOfBinaryTree{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return LCA(root,p,q);
    }
    public TreeNode LCA(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)return null;
        if(root==p||root==q)return root;
        TreeNode left=LCA(root.left,p,q);
        TreeNode right=LCA(root.right,p,q);
        if(left!=null&&right!=null)return root;
        if(left!=null)return left;
        else return right;
    }
}
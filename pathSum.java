/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class pathSum{
    public boolean hasPathSum(TreeNode root, int sum) {
        return pathSum(root,sum,0);
    }
    public boolean pathSum(TreeNode root,int target,int sum){
        if(root==null)return false;
        sum=sum+root.val;
        if(sum==target&&root.left==null&&root.right==null)return true;
        else{
            return pathSum(root.left,target,sum)||pathSum(root.right,target,sum);
        }
    }
}
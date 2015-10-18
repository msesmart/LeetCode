/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class pathSumII{
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();
        pathSum(root,sum,res,list);
        return res;
    }
    public void pathSum(TreeNode root,int target,List<List<Integer>> res,List<Integer> list){
        if(root==null)return;
        list.add(root.val);
        if(root.val==target&&root.left==null&&root.right==null){
            List<Integer> newList=new ArrayList<Integer>(list);
            res.add(newList);
        }
        else{
            pathSum(root.left,target-root.val,res,list);
            pathSum(root.right,target-root.val,res,list);
        }
        list.remove(list.size()-1);
    }
}
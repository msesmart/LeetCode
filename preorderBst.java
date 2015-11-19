/* preorder traversal of BST using stack*/
import java.util.*;
import java.io.*;

public class preorderBst {
	public ArrayList<Integer> preorderBst(TreeNode root) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		if (root == null) return resultList;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			resultList.add(node.val);
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
		}
		return resultList;
	}
}
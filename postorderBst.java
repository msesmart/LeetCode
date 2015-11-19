/* postorder traversal of BST using stack*/
import java.util.*;
import java.io.*;

public class postorderBst {
	public ArrayList<Integer> postorderBst(TreeNode root) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		if (root == null) return resultList;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if (root.right != null) 
			stack.push(root.right);
		stack.push(root);
		root = root.left;
		while (!stack.isEmpty) {
			while (root != null) {
				if (root.right != null) 
					stack.push(root.right);
				stack.push(root);
				root = root.left;
			}
			root = stack.pop();
			if (root.right != null && stack.peek() == root.right) {
				stack.pop();
				stack.push(root);
				root = root.right;
			} else {
				resultList.add(root.val);
				root = null;
			}
		}
	}
}
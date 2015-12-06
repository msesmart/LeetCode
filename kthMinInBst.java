public class kthMinInBst {
	public int kthMinInBst(TreeNode root, int k) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p = root;
		while(!stack.isEmpty() || p != null) {
			if(p != null) {
				stack.push(p);
				p = p.left;
			} else {
				p = stack.pop();
				k --;
				if(k == 0) return p.val;
				p = p.right;
			}
		}
		return 0;
	}
	int K = 0;
	public int kthMinInBstRecursive(TreeNode root, int k) {
		if (root == null) return 0;
		int lv = kthMinInBstRecursive(root.left, k);
		if(K == k) return lv;
		K ++;
		if(K == k) return root.val;
		int rv = kthMinInBstRecursive(root.right, k);
		if(K == k) return rv;
	}
}
package edu.clemson.ece.leetcode.LowestCommonAncestorOfABinarySearchTree;

public class LowestCommonAncestorOfABinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val&&root.val>q.val) return lowestCommonAncestor(root.left, p, q);
        if(root.val<p.val&&root.val<q.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}

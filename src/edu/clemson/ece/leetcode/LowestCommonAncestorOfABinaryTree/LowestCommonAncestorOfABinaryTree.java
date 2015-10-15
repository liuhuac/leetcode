package edu.clemson.ece.leetcode.LowestCommonAncestorOfABinaryTree;

public class LowestCommonAncestorOfABinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p||root==q) return root;// why root.val==p.val does not work?
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if(l!=null&&r!=null){
            return root;
        } else if(l==null&&r==null){
            return null;
        } else if(l!=null){
            return l;
        } else {
            return r;
        }
    }
}

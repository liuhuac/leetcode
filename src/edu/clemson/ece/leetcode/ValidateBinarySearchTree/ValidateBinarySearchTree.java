package edu.clemson.ece.leetcode.ValidateBinarySearchTree;

public class ValidateBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isValidBST(TreeNode root) {
        if(null==root || (null==root.left && null==root.right)) return true;
        if(null==root.left) return root.val < getMin(root.right) && isValidBST(root.right);
        if(null==root.right) return root.val > getMax(root.left) && isValidBST(root.left);
        return isValidBST(root.left) && isValidBST(root.right) && getMax(root.left) < root.val && root.val < getMin(root.right);
    }
    public int getMin(TreeNode root){
        TreeNode scan = root;
        while(null!=scan.left) scan = scan.left;
        return scan.val;
    }
    public int getMax(TreeNode root){
        TreeNode scan = root;
        while(null!=scan.right) scan = scan.right;
        return scan.val;
    }
}

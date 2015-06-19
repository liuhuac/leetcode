package edu.clemson.ece.leetcode.SumRootToLeafNumbers;

public class SumRootToLeafNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int sumNumbers(TreeNode root) {
        if(null==root) return 0;
        return sumNumbers(root, 0);
    }
    
    public int sumNumbers(TreeNode root, int n) {
        if(null==root.left&&null==root.right) return n+root.val;
        n = (n + root.val) * 10;
        if(null==root.left) return sumNumbers(root.right, n);
        if(null==root.right) return sumNumbers(root.left, n);
        return sumNumbers(root.left, n) + sumNumbers(root.right, n);
    }
}

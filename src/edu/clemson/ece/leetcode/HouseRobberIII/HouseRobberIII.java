package edu.clemson.ece.leetcode.HouseRobberIII;

public class HouseRobberIII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int rob(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.val;
        if(root.left==null){
            return Math.max(rob(root.right.left)+rob(root.right.right)+root.val, rob(root.right));
        }
        if(root.right==null){
            return Math.max(rob(root.left.left)+rob(root.left.right)+root.val, rob(root.left));
        }
        return Math.max(rob(root.left.left)+rob(root.left.right)+rob(root.right.left)+rob(root.right.right)+root.val, rob(root.left)+rob(root.right));
    }
}

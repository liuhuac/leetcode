package edu.clemson.ece.leetcode.MaximumDepthOfBinaryTree;

public class MaximumDepthOfBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxDepth(TreeNode root) {
        if(null==root){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

package edu.clemson.ece.leetcode.MinimumDepthOfBinaryTree;

public class MinimumDepthOfBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minDepth(TreeNode root) {
        if(null==root){
            return 0;
        }
        
        if(null==root.left){
            if(null==root.right){
                return 1;
            } else {
                return minDepth(root.right) + 1;
            }
        } else if(null==root.right) {
            return minDepth(root.left) + 1;
        } else {
            return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
        }
    }
}

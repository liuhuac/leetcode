package edu.clemson.ece.leetcode.BalancedBinaryTree;

public class BalancedBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isBalanced(TreeNode root) {
        if(null==root){
            return true;
        }
        if(!isBalanced(root.left)||!isBalanced(root.right)){
            return false;
        }
        return Math.abs(height(root.left)-height(root.right))<=1;
    }
    
    public int height(TreeNode root){
        if(null==root){
            return 0;
        }
        if(null==root.left && null==root.right){
            return 1;
        }
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}

package edu.clemson.ece.leetcode.InvertBinaryTree;

public class InvertBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode invertTree(TreeNode root) {
        if(null==root){
            return null;
        }
        TreeNode tmp = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = tmp;
        
        return root;
    }
}

package edu.clemson.ece.leetcode.SymmetricTree;

public class SymmetricTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSymmetric(TreeNode root) {
        if(null==root){
            return true;
        }
        
        return isMirror(root.left, root.right);
    }
    
    public boolean isMirror(TreeNode left, TreeNode right){
        if(null==left && null==right){
            return true;
        }
        if(null==left || null==right){
            return false;
        }
        return left.val==right.val && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}

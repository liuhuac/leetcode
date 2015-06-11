package edu.clemson.ece.leetcode.SameTree;

public class SameTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(null==p && null==q){
            return true;
        }
        if(null==p || null==q){
            return false;
        }
        return p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

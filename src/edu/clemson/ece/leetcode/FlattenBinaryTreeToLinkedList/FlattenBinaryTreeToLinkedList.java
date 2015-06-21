package edu.clemson.ece.leetcode.FlattenBinaryTreeToLinkedList;

public class FlattenBinaryTreeToLinkedList {

	/**
	 * @param args
	 */
	TreeNode pre;
    public void flatten(TreeNode root) {
        if(null==root) return;
        pre = root;
        flatten(root.left);
        pre.right = root.right;
        flatten(root.right);
        if(null!=root.left){
            root.right = root.left;
            root.left = null;
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

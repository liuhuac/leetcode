package edu.clemson.ece.leetcode.RecoverBinarySearchTree;

public class RecoverBinarySearchTreeOn {

	/**
	 * @param args
	 */
	TreeNode fst = null;
    TreeNode snd = null;
    TreeNode pre = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        inOrder(root);
        int tmp = snd.val;
        snd.val = fst.val;
        fst.val = tmp;
    }
    public void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        if(fst==null&&pre.val>root.val) fst = pre;
        if(fst!=null&&pre.val>root.val) snd = root;
        pre = root;
        inOrder(root.right);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

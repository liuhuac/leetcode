package edu.clemson.ece.leetcode.RecoverBinarySearchTree;

public class RecoverBinarySearchTree {

	/**
	 * @param args
	 */
	TreeNode fst = null;
    TreeNode snd = null;
    TreeNode pre = new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        
        if(root==null) return;
        
        TreeNode cur = root;
        
        while(cur!=null){
            if(cur.left==null){
                //
                if(fst==null&&pre.val>cur.val) fst = pre;
                if(fst!=null&&pre.val>cur.val) snd = cur;
                pre = cur;
                //
                cur = cur.right;
            } else {
                TreeNode scan = cur.left;
                while(scan.right!=null&&scan.right!=cur) scan = scan.right;
                if(scan.right==null){
                    scan.right = cur;
                    cur = cur.left;
                } else {
                    scan.right = null;
                    //
                    if(fst==null&&pre.val>cur.val) fst = pre;
                    if(fst!=null&&pre.val>cur.val) snd = cur;
                    pre = cur;
                    //
                    cur = cur.right;
                }
            }
        }
        
        int tmp = snd.val;
        snd.val = fst.val;
        fst.val = tmp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

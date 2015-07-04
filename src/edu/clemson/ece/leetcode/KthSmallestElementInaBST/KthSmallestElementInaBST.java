package edu.clemson.ece.leetcode.KthSmallestElementInaBST;

public class KthSmallestElementInaBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int kthSmallest(TreeNode root, int k) {
        int[] n = new int[]{0};
        int[] res = new int[]{0};
        kthSmallest(root, k, n, res);
        return res[0];
    }
    public boolean kthSmallest(TreeNode root, int k, int[] n, int[] res) {
        if(null==root) return false;
        if(kthSmallest(root.left, k, n, res)) return true;
        n[0]++;
        if(k==n[0]) {
            res[0] = root.val;
            return true;
        } 
        return kthSmallest(root.right, k, n, res);
    }
}

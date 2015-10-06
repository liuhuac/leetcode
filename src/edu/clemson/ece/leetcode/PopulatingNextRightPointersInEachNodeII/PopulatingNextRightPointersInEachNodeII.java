package edu.clemson.ece.leetcode.PopulatingNextRightPointersInEachNodeII;

public class PopulatingNextRightPointersInEachNodeII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void connect(TreeLinkNode root) {
        if(null==root) return;
        connect(root.left);
        connect(root.right);
        TreeLinkNode left = root.left;
        TreeLinkNode right = root.right;
        while(null!=left&&null!=right){
            TreeLinkNode rightmost = left;
            TreeLinkNode leftmost = right;
            while(null!=rightmost.next) rightmost = rightmost.next;
            left = next(left);
            right = next(right);
            rightmost.next = leftmost;
        }
    }
    public TreeLinkNode next(TreeLinkNode root) {
        while(null==root.left&&null==root.right) {
            if(null==root.next) return null;
            root = root.next;
        }
        if(null!=root.left) return root.left;
        return root.right;
    }
}

package edu.clemson.ece.leetcode.ConvertSortedListToBinarySearchTree;

public class ConvertSortedListToBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode sortedListToBST(ListNode head) {
        int len = 0;
        ListNode scan = head;
        while(null!=scan) {
            scan = scan.next;
            len++;
        }
        return sortedListToBST(head, len);
    }
    public TreeNode sortedListToBST(ListNode head, int len) {
        if(0>=len) return null;
        int mid = len / 2;
        ListNode midnode = head;
        for(int i=0; i<mid; i++) midnode = midnode.next;
        TreeNode tree = new TreeNode(midnode.val);
        tree.left = sortedListToBST(head, mid);
        tree.right = sortedListToBST(midnode.next, len - mid - 1);
        return tree;
    }

}

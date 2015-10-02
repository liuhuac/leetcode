package edu.clemson.ece.leetcode.DeleteNodeInALinkedList;

public class DeleteNodeInALinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void deleteNode(ListNode node) {
        ListNode scan = node;
        while(scan!=null && scan.next!=null){
            scan.val = scan.next.val;
            if(scan.next.next==null){
                scan.next = null;
                break;
            }
            scan = scan.next;
        }
    }
}

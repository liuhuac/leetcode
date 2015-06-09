package edu.clemson.ece.leetcode.ReverseLinkedList;

public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseList(ListNode head) {
        if(null==head){
            return null;
        }
        ListNode reverse = head;
        ListNode scan = head.next;
        ListNode tmp = null;
        while(scan!=null){
            tmp = scan;
            scan = scan.next;
            tmp.next = reverse;
            reverse = tmp;
        }
        head.next = null;
        return reverse;
    }

}

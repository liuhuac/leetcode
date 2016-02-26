package edu.clemson.ece.leetcode.OddEvenLinkedList;

public class OddEvenLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode evenHead = head.next;
        ListNode scan = head;
        ListNode oddEnd = null;
        boolean isOdd = true;
        while(scan.next!=null){
            if(isOdd) oddEnd = scan;
            ListNode next = scan.next;
            scan.next = scan.next.next;
            scan = next;
            isOdd = !isOdd;
        }
        if(oddEnd.next!=null) {
            oddEnd.next.next = evenHead;
        } else {
            oddEnd.next = evenHead;
        }
        return head;
    }
}

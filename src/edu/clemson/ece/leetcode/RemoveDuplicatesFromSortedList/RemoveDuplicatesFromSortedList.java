package edu.clemson.ece.leetcode.RemoveDuplicatesFromSortedList;

public class RemoveDuplicatesFromSortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode deleteDuplicates(ListNode head) {
        if(null==head){
            return null;
        }
        ListNode cur = head;
        ListNode scan = head.next;
        while(null!=scan){
            if(scan.val==cur.val){
                cur.next = scan.next;
            } else {
                cur = scan;
            }
            scan = scan.next;
        }
        return head;
    }
}

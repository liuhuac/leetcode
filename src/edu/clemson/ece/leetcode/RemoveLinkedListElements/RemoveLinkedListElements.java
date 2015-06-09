package edu.clemson.ece.leetcode.RemoveLinkedListElements;

public class RemoveLinkedListElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode removeElements(ListNode head, int val) {
        if(null==head){
            return null;
        }
        ListNode scan = head;
        while(null!=scan){
            if(scan.val==val){
                scan = scan.next;
            } else {
                break;
            }
        }
        if(null==scan){
            return null;
        }
        ListNode reHead = scan;
        ListNode pre = scan;
        scan = scan.next;
        while(scan!=null){
            if(val==scan.val){
                scan = scan.next;
                pre.next = scan;
            } else {
                scan = scan.next;
                pre = pre.next;
            }
        }
        return reHead;
    }
}

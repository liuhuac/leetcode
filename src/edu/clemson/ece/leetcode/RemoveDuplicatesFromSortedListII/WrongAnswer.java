package edu.clemson.ece.leetcode.RemoveDuplicatesFromSortedListII;

public class WrongAnswer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrongAnswer rm = new WrongAnswer();
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		rm.deleteDuplicates(head);
	}
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode ans = null;
        ListNode pre = new ListNode(0);
        ListNode scan = head.next;
        ListNode tmp = scan;
        pre.next = head;
        while(scan!=null){
            while(scan!=null&&scan.val==pre.next.val){
                pre.next.next = scan.next;
                scan = scan.next;
            }
            if(ans==null) {
                if(pre.next.next==tmp){
                    ans = pre.next;
                } else {
                    ans = scan;
                }
            }
            pre.next = scan;
        }
        return ans;
    }
}

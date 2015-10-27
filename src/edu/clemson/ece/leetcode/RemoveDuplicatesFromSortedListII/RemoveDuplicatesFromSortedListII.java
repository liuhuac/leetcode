package edu.clemson.ece.leetcode.RemoveDuplicatesFromSortedListII;

public class RemoveDuplicatesFromSortedListII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode ans = new ListNode(0);
        ListNode pre = ans;
        ListNode scan = head;
        pre.next = head;
        while(scan!=null){
            while(scan.next!=null&&scan.val==scan.next.val){
                scan = scan.next;
            }
            if(pre.next==scan) {
                pre = pre.next;
            } else {
                pre.next = scan.next;
            }
            scan = scan.next;
        }
        return ans.next;
    }
}

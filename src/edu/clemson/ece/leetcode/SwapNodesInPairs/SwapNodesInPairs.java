package edu.clemson.ece.leetcode.SwapNodesInPairs;

public class SwapNodesInPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode swapPairs(ListNode head) {
        if(null==head) return null;
        if(null==head.next) return head;
        ListNode cur = head;
        ListNode pre = null;
        head = cur.next;
        while(null!=cur){
            if(null==cur.next) break;
            if(null==pre){
                pre = new ListNode(0);
            }
            pre.next = cur.next;
            cur.next = cur.next.next;
            pre.next.next = cur;
            pre = cur;
            cur = cur.next;
        }
        return head;
    }
}

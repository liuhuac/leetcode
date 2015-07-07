package edu.clemson.ece.leetcode.RotateList;

public class RotateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode rotateRight(ListNode head, int k) {
        if(null==head) return null;
        ListNode fast = new ListNode(0);
        ListNode slow = new ListNode(0);
        fast.next = head;
        slow.next = head;
        int len = 0;
        ListNode scan = head;
        while(null!=scan){
            scan = scan.next;
            len++;
        }
        k = k % len;
        if(0==k) return head;
        for(int i=0; i<k; i++) fast = fast.next;
        ListNode prefast = null;
        ListNode preslow = null;
        while(null!=fast){
            prefast = fast;
            fast = fast.next;
            preslow = slow;
            slow = slow.next;
        }
        if(prefast==head) return head;
        prefast.next = head;
        preslow.next = null;
        return slow;
    }
}

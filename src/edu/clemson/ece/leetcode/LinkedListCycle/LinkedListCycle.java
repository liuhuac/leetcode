package edu.clemson.ece.leetcode.LinkedListCycle;

public class LinkedListCycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) {
	 *         val = x;
	 *         next = null;
	 *     }
	 * }
	 */
	public boolean hasCycle(ListNode head) {
        if(null==head) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(true){
            if(null==fast) break;
            if(null==fast.next) break;
            if(null==fast.next.next) break;
            if(fast==slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}

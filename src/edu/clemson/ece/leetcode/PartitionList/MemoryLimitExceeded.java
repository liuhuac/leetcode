package edu.clemson.ece.leetcode.PartitionList;

public class MemoryLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode partition(ListNode head, int x) {
        ListNode scan = head;
        ListNode small = null;
        ListNode large = null;
        ListNode send = null;
        ListNode lend = null;
        while(null!=scan){
            if(scan.val<x){
                if(null==small) small = scan;
                if(null==send){
                    send = scan;
                } else {
                    send.next = scan;
                    send = scan;
                }
            } else {
                if(null==large) large = scan;
                if(null==lend){
                    lend = scan;
                } else {
                    lend.next = scan;
                    lend = scan;
                }
            }
            scan = scan.next;
        }
        if(null!=lend) lend.next = null; // Very important, avoid cycle
        if(null==send) return large;
        send.next = large;
        return small;
    }
}

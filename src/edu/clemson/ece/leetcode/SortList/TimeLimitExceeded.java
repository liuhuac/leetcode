package edu.clemson.ece.leetcode.SortList;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode sortList(ListNode head) {
        if(null==head) return null;
        ListNode lowhead = null;
        ListNode highhead = null;
        ListNode lowend = null;
        ListNode highend = null;
        ListNode mid = head;
        ListNode scan = head.next;
        while(null!=scan){
            if(scan.val<mid.val){
                if(null==lowhead){
                    lowhead = scan;
                } else {
                    lowend.next = scan;
                }
                lowend = scan;
            } else {
                if(null==highhead){
                    highhead = scan;
                } else {
                    highend.next = scan;
                }
                highend = scan;
            }
            scan = scan.next;
        }
        mid.next = null;
        if(null!=lowend) lowend.next = null;
        if(null!=highend) highend.next = null;
        sortList(lowhead);
        sortList(highhead);
        if(null==lowhead){
            mid.next = highhead;
            return mid;
        } else if(null==highhead){
            lowend.next = mid;
            return lowhead;
        } else {
            lowend.next = mid;
            mid.next = highhead;
            return lowhead;
        }
    }
}

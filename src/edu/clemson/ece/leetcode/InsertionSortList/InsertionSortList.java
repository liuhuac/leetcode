package edu.clemson.ece.leetcode.InsertionSortList;

public class InsertionSortList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode insertionSortList(ListNode head) {
        if(null==head) return null;
        ListNode remain = head;
        ListNode cur = new ListNode(0);
        ListNode prescan = null;
        ListNode scan = null;
        ListNode premin = null;
        ListNode min = null;
        while(null!=remain){
            prescan = null;
            scan = remain;
            int minValue = Integer.MAX_VALUE;
            while(null!=scan){
                if(scan.val<=minValue){
                    minValue = scan.val;
                    premin = prescan;
                    min = scan;
                }
                prescan = scan;
                scan = scan.next;
            }
            
            if(remain==head) head = min;
            
            cur.next = min;
            if(null==premin){
                remain = min.next;
            } else {
                premin.next = min.next;
            }
            min.next = null;
            cur = min;
        }
        return head;
    }
}

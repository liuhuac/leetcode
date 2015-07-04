package edu.clemson.ece.leetcode.ReorderList;

public class ReorderList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l3 = new ListNode(3);
		ListNode l2 = new ListNode(2);
		ListNode l1 = new ListNode(1);
		l1.next = l2;
		l2.next = l3;
		ReorderList rl = new ReorderList();
		rl.reorderList(l1);
	}
	public void reorderList(ListNode head) {
        ListNode scan1 = head;
        ListNode end = head;
        ListNode scan2 = null;
        int length = 0;
        while(scan1!=null){
            length++;
            scan1 = scan1.next;
        }
        int mid = (length - 1) / 2;
        int i = 0;
        while(i++!=mid){
            end = end.next;
        }
        scan1 = head;
        while(scan1!=end){
            scan2 = end.next;
            ListNode pre = end;
            while(scan2.next!=null){
                pre = scan2;
                scan2 = scan2.next;
            }
            pre.next = null;
            pre = scan1.next;
            scan1.next = scan2;
            scan2.next = pre;
            scan1 = pre;
        }
    }
}

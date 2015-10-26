package edu.clemson.ece.leetcode.SortList;

public class SortList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortList sl = new SortList();
		ListNode head = new ListNode(3);
		head.next = new ListNode(4);
		head.next.next = new ListNode(1);
		sl.sortList(head);
	}
	public ListNode sortList(ListNode head) {
        if(head==null||head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode list1 = sortList(head);
        ListNode list2 = sortList(slow);
        return merge(list1,list2);
    }
    public ListNode merge(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(0);
        ListNode scan = dummy;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                scan.next = list1;
                scan = list1;
                list1 = list1.next;
            } else {
                scan.next = list2;
                scan = list2;
                list2 = list2.next;
            }
        }
        scan.next = list1==null ? list2 : list1;
        return dummy.next;
    }
}

package edu.clemson.ece.leetcode.IntersectionOfTwoLinkedLists;

public class IntersectionOfTwoLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntersectionOfTwoLinkedLists il = new IntersectionOfTwoLinkedLists();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		System.out.println(il.getIntersectionNode(a, b));
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0;
        int l2 = 0;
        ListNode scan = headA;
        while(null!=scan){
            l1++;
            scan =  scan.next;
        }
        scan = headB;
        while(null!=scan){
            l2++;
            scan =  scan.next;
        }
        ListNode newscan = null;
        if(l1>=l2){
            scan = headA;
            newscan = headB;
            for(int i=0; i<l1-l2; i++){
                scan = scan.next;
            }
        } else if (l1<l2) {
            scan = headB;
            newscan = headA;
            for(int i=0; i<l2-l1; i++){
                scan = scan.next;
            }
        }
        while(null!=scan){
            if(scan.val==newscan.val){
                break;
            }
            scan = scan.next;
            newscan = newscan.next;
        }
        return scan;
    }
}

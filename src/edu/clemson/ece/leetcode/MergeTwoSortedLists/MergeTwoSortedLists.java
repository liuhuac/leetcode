package edu.clemson.ece.leetcode.MergeTwoSortedLists;

public class MergeTwoSortedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /*if(null==l1) return l2;
        if(null==l2) return l1;*/
        
        ListNode head = new ListNode(0);//l1.val<l2.val ? l1 : l2;
        ListNode cur = head;
        
        /*if(l1.val<l2.val){
            l1=l1.next;
        } else {
            l2=l2.next;
        }*/
        
        while(null!=l1 || null!=l2){
            if(null==l1){
                cur.next = l2;
                break;
            }
            if(null==l2){
                cur.next = l1;
                break;
            }
            if(l1.val<l2.val){
                cur.next = l1;
                cur = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = l2;
                l2 = l2.next;
            }
        }
        return head.next;
    }
}

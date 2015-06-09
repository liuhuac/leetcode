package edu.clemson.ece.leetcode.RemoveNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;
        if(null == right.next){
            return null;
        }
        for(int i=0; i<n; i++){
            right = right.next;
        }
        if(null == right){
            return head.next;
        }
        while(null!=right.next){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return head;
    }
}

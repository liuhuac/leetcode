package edu.clemson.ece.leetcode.PalindromeLinkedList;

public class PalindromeLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(ListNode head) {
        if(null==head||null==head.next) return true;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null){
            if(fast.next==null) break;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = reverse(slow);
        ListNode left = head;
        while(left!=null&&right!=null){
            if(left.val!=right.val){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public ListNode reverse(ListNode node){
        ListNode pre = null;
        while(node!=null){
            ListNode tmp = node.next;
            node.next = pre;
            pre = node;
            node = tmp;
        }
        return pre;
    }
}

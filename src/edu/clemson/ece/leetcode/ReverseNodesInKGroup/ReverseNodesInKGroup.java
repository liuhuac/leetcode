package edu.clemson.ece.leetcode.ReverseNodesInKGroup;

public class ReverseNodesInKGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseKGroup(ListNode head, int k) {
        if(k<2||head==null||head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre=dummy, tail=dummy, tmp=dummy;
        while(true){
            int count = k;
            while(count>0 && tail!=null) {count--; tail=tail.next;}
            if(tail==null) break;
            head = pre.next; // store head for next round
            while(pre.next!=tail){
                tmp = pre.next;
                pre.next = tmp.next;
                tmp.next = tail.next;
                tail.next = tmp;                
            }
            pre = head;
            tail = head;
        }
        return dummy.next;
    }
}

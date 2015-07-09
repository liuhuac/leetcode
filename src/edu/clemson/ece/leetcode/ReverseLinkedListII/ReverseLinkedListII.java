package edu.clemson.ece.leetcode.ReverseLinkedListII;

public class ReverseLinkedListII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedListII rl = new ReverseLinkedListII();
		ListNode ln1 = new ListNode(3);
		ListNode ln2 = new ListNode(5);
		ln1.next = ln2;
		rl.reverseBetween(ln1, 1, 2);
	}
	public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode firstend = new ListNode(0);
        ListNode reversehead = null;
        ListNode reverseend = null;
        ListNode scan =  new ListNode(0);
        ListNode next = null;
        firstend.next = head;
        scan.next = head;
        for(int i=0; i<m; i++){
            scan = scan.next;
            if(i==m-1) break;
            firstend = firstend.next;
        }
        
        for(int i=m; i<=n; i++){
            next = scan.next;
            if(null==reversehead){
                reversehead = scan;
                reverseend = scan;
                scan.next = null;
            } else {
                scan.next = reversehead;
                reversehead = scan;
            }
            scan = next;
        }
        
        
        if(firstend.next==head){
            head = reversehead;
        } else {
            firstend.next = reversehead;
        }
        
        reverseend.next = scan;
        return head;
    }
}

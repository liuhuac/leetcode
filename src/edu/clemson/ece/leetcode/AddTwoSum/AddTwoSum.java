package edu.clemson.ece.leetcode.AddTwoSum;

public class AddTwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		
		AddTwoSum solution = new AddTwoSum();
		ListNode result = solution.addTwoNumbers(l1, l2);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n = 0;
        int sum = 0;
        int val1,val2;
        ListNode result = null;
        ListNode tmp = null;
        while(l1!=null || l2!=null){
            if(l1==null){
                val1 = 0;
            } else {
                val1 = l1.val;
                l1 = l1.next;
            }
            if(l2==null){
                val2 = 0;
            } else {
                val2 = l2.val;
                l2 = l2.next;
            }
            sum = val1 + val2 + n;
            if(tmp==null){
                tmp = result = new ListNode(sum%10);
            } else {
                tmp.next = new ListNode(sum%10);
                tmp = tmp.next;
            }
            n = sum/10;
            sum = 0;
        }
        if(n!=0){
            tmp.next = new ListNode(n);
        }
        return result;
    }
}

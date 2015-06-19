package edu.clemson.ece.leetcode.LinkedListCycleII;

public class LinkedListCycleII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListCycleII llc = new LinkedListCycleII();
		ListNode p = new ListNode(-1);
		ListNode list = p;
		p.next = new ListNode(-7); p = p.next;
		p.next = new ListNode(7); p = p.next;
		p.next = new ListNode(-4); p = p.next;
		p.next = new ListNode(19); p = p.next;
		p.next = new ListNode(6); p = p.next;
		ListNode b = p;
		p.next = new ListNode(-9); p = p.next;
		p.next = new ListNode(-5); p = p.next;
		p.next = new ListNode(-2); p = p.next;
		p.next = new ListNode(-5); p = p.next;
		p.next = b;
		System.out.print(llc.detectCycle(list).val);
	}

	public ListNode detectCycle(ListNode head) {
        ListNode s = new ListNode(0);
        ListNode f = new ListNode(0);
        int ds = 0;
        int ds1 = 0;
        int ds2 = 0;
        s.next = head;
        f.next = head;
        while(null!=f){
            if(f==s){
                if(0==ds1){
                    ds1 = ds;
                } else {
                    ds2 = ds;
                    break;
                }
            }
            ds++;
            s = s.next;
            if(null==f.next) break;
            f = f.next.next;
        }
        int c = ds2 - ds1;
        if(0==c) return null;
        ListNode ss = new ListNode(0);
        ListNode ff = new ListNode(0);
        ss.next = head;
        ff.next = head;
        for(int i=0; i<c; i++){
            ff = ff.next;
        }
        while(ss!=ff){
            ss = ss.next;
            ff = ff.next;
        }
        return ss;
    }
}

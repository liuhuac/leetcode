package edu.clemson.ece.leetcode.MergeKSortedLists;

import java.util.PriorityQueue;
import java.util.Comparator;

public class MergeKSortedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeKSortedLists msl = new MergeKSortedLists();
		msl.mergeKLists(null);
	}
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists==null||lists.length==0) return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>(){
                @Override
                public int compare(ListNode l1, ListNode l2){
                    return Integer.compare(l1.val, l2.val);
                }
            }
        );
        for(ListNode ln : lists){
        	if(ln!=null) queue.add(ln); // attention
        }
        ListNode dummy = new ListNode(0);
        ListNode scan = dummy;
        while(!queue.isEmpty()){
            scan.next = queue.poll();
            scan = scan.next;
            if(scan.next!=null) queue.add(scan.next);
        }
        return dummy.next;
    }
}

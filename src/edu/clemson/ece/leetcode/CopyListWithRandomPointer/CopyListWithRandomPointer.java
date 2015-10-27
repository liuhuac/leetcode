package edu.clemson.ece.leetcode.CopyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode scan = head;
        RandomListNode ans = new RandomListNode(0);
        RandomListNode pre = ans;
        Map<RandomListNode,RandomListNode> map = new HashMap<>();
        while(scan!=null){
            pre.next = new RandomListNode(scan.label);
            map.put(scan,pre.next);
            scan = scan.next;
            pre = pre.next;
        }
        pre = ans.next; // attention: ans.next not head
        scan = head;
        while(scan!=null){
            pre.random = map.get(scan.random); // attention: scan.random not scan
            scan = scan.next;
            pre = pre.next;
        }
        return ans.next;
    }
}

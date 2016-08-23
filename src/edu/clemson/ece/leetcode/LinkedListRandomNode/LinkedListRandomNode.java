package edu.clemson.ece.leetcode.LinkedListRandomNode;

/**
 ** Definition for singly-linked list.
 ** public class ListNode {
 **     int val;
 **     ListNode next;
 **     ListNode(int x) { val = x; }
 ** }
 **/
public class LinkedListRandomNode {

/** @param head The linked list's head.
 *         Note that the head is guaranteed to be not null, so it contains at least one node. */
        
    private ListNode listHead = null;
    
    public Solution(ListNode head) {
        listHead = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode scan = listHead;
        Random rd = new Random();
        int n = 2;
        int ans = scan.val;
        while((scan=scan.next)!=null){
            if(rd.nextInt(n++)==1) ans = scan.val;
        }
        return ans;
    }
}

/**
 ** Your Solution object will be instantiated and called as such:
 ** Solution obj = new Solution(head);
 ** int param_1 = obj.getRandom();
 **/

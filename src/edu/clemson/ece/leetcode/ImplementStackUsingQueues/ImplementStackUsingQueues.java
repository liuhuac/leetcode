package edu.clemson.ece.leetcode.ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {

	/**
	 * @param args
	 */
	Queue<Integer> q = new LinkedList<Integer>();
    
    // Push element x onto stack.
    public void push(int x) {
        q.add(x);
        for(int i=0; i<q.size()-1; i++){
            q.add(q.remove());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.remove();
    }

    // Get the top element.
    public int top() {
        return q.element();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

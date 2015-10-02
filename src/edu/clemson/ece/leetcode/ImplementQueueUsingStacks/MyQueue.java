package edu.clemson.ece.leetcode.ImplementQueueUsingStacks;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> data = new Stack<Integer>();
    Stack<Integer> buffer = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) {
        data.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        shift(data,buffer);
        buffer.pop();
        shift(buffer,data);
    }

    // Get the front element.
    public int peek() {
        shift(data,buffer);
        int res = buffer.peek();
        shift(buffer,data);
        return res;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return data.isEmpty();
    }
    
    public void shift(Stack<Integer> a, Stack<Integer> b){
        while(!a.isEmpty()){
            int element = a.pop();
            b.push(element);
        }
    }
}

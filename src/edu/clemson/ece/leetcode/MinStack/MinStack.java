package edu.clemson.ece.leetcode.MinStack;

import java.util.Stack;

public class MinStack {

	/**
	 * @param args
	 */
	Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    
    public void push(int x) {
        if(min.empty()){
            min.push(x);
        } else if(x<=min.peek()){
            min.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        int x = stack.peek();
        stack.pop();
        for(int i=0; i<min.size(); i++){
            if(min.peek()==x){
                min.pop();
                break;
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

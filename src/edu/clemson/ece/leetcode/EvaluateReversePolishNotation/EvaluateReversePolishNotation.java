package edu.clemson.ece.leetcode.EvaluateReversePolishNotation;

import java.util.Stack;

public class EvaluateReversePolishNotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int op1;
        int op2;
        for(int i=0; i<tokens.length; i++){
            switch(tokens[i]){
                case "+": 
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-": 
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op2 - op1);
                    break;
                case "*": 
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    op1 = stack.pop();
                    op2 = stack.pop();
                    stack.push(op2 / op1);
                    break;
                default : 
                    stack.push(Integer.valueOf(tokens[i]));
                    break;
            }
        }
        return stack.pop();
    }
}

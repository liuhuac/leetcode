package edu.clemson.ece.leetcode.LongestValidParentheses;

import java.util.Stack;

public class WrongAnswer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrongAnswer wa = new WrongAnswer();
		wa.longestValidParentheses("()(()");
	}
	public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chararray = s.toCharArray();
        int length = 0;
        int maxlength = 0;
        for(char c : chararray){
            if(c=='('){
                stack.add(c);
            } else {
                if(!stack.isEmpty()){
                    length += 2;
                    stack.pop();
                } else {
                    if(maxlength<length) maxlength = length;
                    length = 0;
                }
            }
        }
        if(maxlength<length) maxlength = length;
        return maxlength;
    }
}

package edu.clemson.ece.leetcode.ValidParentheses;

import java.util.Stack;

public class ValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String s) {
        if(0==s.length()) return false;
        if(1==s.length()%2) return false;
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(st.isEmpty() && (')'==c||']'==c||'}'==c)) return false;
            if(!st.isEmpty() && (')'==c||']'==c||'}'==c)) {
                if(!isMatch(st.pop(), c)) return false;
                continue;
            }
            st.push(c);
        }
        return st.isEmpty();
    }
    
    public boolean isMatch(char s, char c){
        switch(s){
            case '(': return ')'==c;
            case '[': return ']'==c;
            case '{': return '}'==c;
        }
        return false;
    }
}

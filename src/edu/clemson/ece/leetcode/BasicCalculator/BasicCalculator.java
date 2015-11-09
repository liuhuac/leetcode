package edu.clemson.ece.leetcode.BasicCalculator;

import java.util.Stack;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculator bc = new BasicCalculator();
		bc.calculate("(5-(1+(5)))");
	}
	public int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int sign = 1;
        int num = 0;
        int ans = 0;
        st.push(sign);
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10+(c-'0');
            } else if(c=='+'){
                ans += st.peek()*sign*num;
                num = 0;
                sign = 1;
            } else if(c=='-'){
                ans += st.peek()*sign*num;
                num = 0;
                sign = -1;
            } else if(c=='('){
                st.push(st.peek()*sign);//attention
                sign = 1;
            } else if(c==')'){
                ans += st.peek()*sign*num;
                num = 0;
                st.pop();
            }
        }
        return ans + sign*num;
    }
}

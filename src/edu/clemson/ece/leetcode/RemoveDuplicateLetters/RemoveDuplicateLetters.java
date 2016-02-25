package edu.clemson.ece.leetcode.RemoveDuplicateLetters;

import java.util.Stack;

public class RemoveDuplicateLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] used = new boolean[26];
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            count[c-'a']--;
            if(used[c-'a']) continue;
            while(!st.isEmpty() && st.peek()>c && count[st.peek()-'a']>0){
                used[st.peek()-'a'] = false;
                st.pop();
            }
            st.push(c);
            used[c-'a'] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0, st.pop());
        }
        return sb.toString();
    }

}

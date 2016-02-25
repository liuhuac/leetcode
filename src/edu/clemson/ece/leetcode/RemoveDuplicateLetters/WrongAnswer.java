package edu.clemson.ece.leetcode.RemoveDuplicateLetters;

public class WrongAnswer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String removeDuplicateLetters(String s) {
        int[] dict = new int[26];
        for(int i=0; i<s.length(); i++){
            if(dict[s.charAt(i)-'a']==0) dict[s.charAt(i)-'a'] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            if(dict[i]==1) sb.append((char)('a'+i));
        }
        return sb.toString();
    }
}

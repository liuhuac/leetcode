package edu.clemson.ece.leetcode.LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

	/**
	 * @param args
	 */
	private char[][] dict = new char[][]{
	        {'a','b','c'},//2
	        {'d','e','f'},//3
	        {'g','h','i'},
	        {'j','k','l'},
	        {'m','n','o'},
	        {'p','q','r','s'},
	        {'t','u','v'},
	        {'w','x','y','z'}
	    };
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0) return ans;
        List<String> tmp = letterCombinations(digits.substring(1));
        for(char c : dict[digits.charAt(0)-'2']){
            if(tmp.size()==0) ans.add(String.valueOf(c));
            for(String s : tmp){
                ans.add(c+s);
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

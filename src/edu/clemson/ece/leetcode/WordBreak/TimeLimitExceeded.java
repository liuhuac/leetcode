package edu.clemson.ece.leetcode.WordBreak;

import java.util.Set;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean wordBreak(String s, Set<String> wordDict) {
        if(wordDict.contains(s)) return true;
        for(int i=1; i<s.length(); i++){
            String left = s.substring(0,i);
            String right = s.substring(i);
            if(wordDict.contains(left)){
                if(wordBreak(right, wordDict)){
                   return true; 
                }
            }
        }
        return false;
    }
}

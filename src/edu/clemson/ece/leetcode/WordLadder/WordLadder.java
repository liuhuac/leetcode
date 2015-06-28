package edu.clemson.ece.leetcode.WordLadder;

import java.util.Set;

public class WordLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        return 0;
    }
    public boolean isAdjacent(String word1, String word2){
        int diff = 0;
        for(int i=0; i<word1.length(); i++){
            if(word1.charAt(i)!=word1.charAt(i)) diff++;
            if(2==diff) return false;
        }
        return true;
    }
}

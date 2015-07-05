package edu.clemson.ece.leetcode.WordLadder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        Queue<String> queue = new LinkedList<>();
        Set<String> used = new HashSet<>();
        int n = 0;
        queue.add(beginWord);
        while(!queue.isEmpty()){
            String str = queue.remove();
            n++;
            Queue<String> tmp = new LinkedList<>();
            while(!queue.isEmpty()){
                
            }
            for(String s : wordDict){
                if(used.contains(s)) continue;
                if(isAdjacent(str,s)){
                    queue.add(s);
                    used.add(s);
                }
            }
        }
        
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

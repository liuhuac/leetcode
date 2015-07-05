package edu.clemson.ece.leetcode.WordLadder;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeLimitExceeded wl = new TimeLimitExceeded();
		Set<String> wordDict = new HashSet<>();
		wordDict.add("hot");
		wordDict.add("dog");
		System.out.println(wl.ladderLength("hot", "dog", wordDict));
	}
	public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        Queue<String> queue = new LinkedList<>();
        Set<String> used = new HashSet<>();
        int n = 0;
        queue.add(beginWord);
        while(!queue.isEmpty()){
            n++;
            Queue<String> tmp = new LinkedList<>();
            while(!queue.isEmpty()){
                String str = queue.remove();
                if(isAdjacent(str,endWord)){
                    return n + 1;
                }
                for(String s : wordDict){
                    if(used.contains(s)) continue;
                    if(isAdjacent(str,s)){
                        tmp.add(s);
                        used.add(s);
                    }
                }
            }
            queue = tmp;
        }
        return 0;
    }
    public boolean isAdjacent(String word1, String word2){
        int diff = 0;
        for(int i=0; i<word1.length(); i++){
            if(word1.charAt(i)!=word2.charAt(i)) diff++;
            if(2==diff) return false;
        }
        return true;
    }
}

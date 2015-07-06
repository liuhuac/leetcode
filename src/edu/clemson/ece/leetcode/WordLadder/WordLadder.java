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
		WordLadder wl = new WordLadder();
		Set<String> wordDict = new HashSet<>();
		wordDict.add("a");
		wordDict.add("b");
		wordDict.add("c");
		System.out.println(wl.ladderLength("a", "c", wordDict));
	}
	public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        Queue<String> queue = new LinkedList<>();
        //wordDict.add(beginWord);
        wordDict.add(endWord);
        int n = 0;
        queue.add(beginWord);
        while(!queue.isEmpty()){
            n++;
            Queue<String> tmp = new LinkedList<>();
            while(!queue.isEmpty()){
                String str = queue.remove();
                if(str.equals(endWord)) return n;
                for(int i=0; i<str.length(); i++){
                    for(char j='a'; j<='z'; j++){
                        if(str.charAt(i)==j) continue;
                        String next = str.substring(0,i) + j + str.substring(i+1);
                        if(wordDict.contains(next)){
                            tmp.add(next);
                            wordDict.remove(next);
                        }
                    }
                }
            }
            queue = tmp;
        }
        return 0;
    }
}

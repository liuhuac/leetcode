package edu.clemson.ece.leetcode.WordBreak;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class TimeLimitExceeded2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean wordBreak(String s, Set<String> wordDict) {
		//if(wordDict.contains(s)) return true; // also TLE
        Queue<String> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            String str = q.remove();
            if(wordDict.contains(str)) return true; // move out while, also TLE
            for(int i=1; i<str.length(); i++){
                String left = str.substring(0,i);
                String right = str.substring(i);
                if(wordDict.contains(left)){
                    if(wordDict.contains(right)){
                        return true;
                    } else {
                        q.add(right);
                    }
                } else if(wordDict.contains(right)){
                    q.add(left);
                }
            }
        }
        return false;
    }
}

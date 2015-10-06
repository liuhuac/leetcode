package edu.clemson.ece.leetcode.WordLadderII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadderII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> dict = new HashSet<>(Arrays.asList("hot","dog","dot"));
		WordLadderII tle = new WordLadderII();
		tle.findLadders("hot", "dog", dict);
	}
	public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<List<String>> ans = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        
        Queue<List<String>> curQueue = new LinkedList<>();
        List<String> tmp = new ArrayList<>();
        tmp.add(start);
        curQueue.add(tmp);
        
        while(!queue.isEmpty()){
            Queue<String> level = new LinkedList<>();
            while(!queue.isEmpty()){
                String word = queue.remove();
                List<String> cur = curQueue.remove();
                for(int i=0; i<word.length(); i++){
                    for(char j='a'; j<='z'; j++){
                        String next = word.substring(0,i) + j + word.substring(i+1);
                        if(end.equals(next)){
                            cur.add(next);
                            ans.add(new ArrayList<String>(cur));
                            continue;
                        }
                        if(!start.equals(next)&&dict.contains(next)){
                            dict.remove(next);
                            level.add(next);
                            List<String> nextcur = new ArrayList<>(cur); // attention
                            nextcur.add(next);
                            curQueue.add(nextcur);
                        }
                    }
                }
            }
            if(ans.isEmpty()) queue = level;
        }
        return ans;
    }
}

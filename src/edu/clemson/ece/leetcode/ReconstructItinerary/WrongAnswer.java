package edu.clemson.ece.leetcode.ReconstructItinerary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class WrongAnswer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> findItinerary(String[][] tickets) {
        List<String> ans = new ArrayList<>();
        Map<String, PriorityQueue<String>> pool = new HashMap<>();
        for(String[] ticket : tickets){
            PriorityQueue<String> tmp = null;
            if(pool.containsKey(ticket[0])){
                tmp = pool.get(ticket[0]);
            } else {
                tmp = new PriorityQueue<>();
            }
            tmp.add(ticket[1]);
            pool.put(ticket[0],tmp);
        }
        
        String current = "JFK";
        while(pool.containsKey(current)){
            ans.add(current);
            PriorityQueue<String> queue = pool.get(current);
            String next = queue.poll();
            if(queue.isEmpty()){
                pool.remove(current);
            }
            current = next;
        }
        ans.add(current);
        
        return ans;
    }

}

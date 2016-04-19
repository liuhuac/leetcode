package edu.clemson.ece.leetcode.ReconstructItinerary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class ReconstructItinerary {

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
        
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while(!stack.isEmpty()){
            while(pool.containsKey(stack.peek()) && !pool.get(stack.peek()).isEmpty()){
                stack.push(pool.get(stack.peek()).poll());
            }
            ans.add(0, stack.pop());
        }
        
        return ans;
    
    }

}

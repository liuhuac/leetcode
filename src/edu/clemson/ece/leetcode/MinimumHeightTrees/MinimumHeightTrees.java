package edu.clemson.ece.leetcode.MinimumHeightTrees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumHeightTrees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        
        if(n==1) {
            List<Integer> ans = new ArrayList<>();
            ans.add(0);
            return ans;
        }
        
        List<Set<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new HashSet<Integer>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(adj.get(i).size()==1) ans.add(i);
        }
        
        while(n>2){ // use n instead of ans.size()
            n -= ans.size();
            List<Integer> tmp = new ArrayList<>();
            for(Integer i : ans){
                int j = adj.get(i).iterator().next();
                adj.get(j).remove(i);
                if(adj.get(j).size()==1) tmp.add(j);
            }
            ans = tmp;
        }
        return ans;
    }

}

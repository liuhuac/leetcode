package edu.clemson.ece.leetcode.CourseSchedule;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i=0; i<prerequisites.length; i++){
            int key = prerequisites[i][0];
            int ele = prerequisites[i][1];
            if(map.containsKey(key)){
                map.get(key).add(ele);
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(ele);
                map.put(key, set);
            }
        }
        
        Queue<Integer> noDependent = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(!map.containsKey(i)) noDependent.add(i);
        }
        
        while(!noDependent.isEmpty()){
            int node = noDependent.remove();
            Queue<Integer> newReady = new LinkedList<>();
            for(Map.Entry<Integer, Set<Integer>> ent : map.entrySet()){
                if(ent.getValue().contains(node)){
                    ent.getValue().remove(node);
                    if(ent.getValue().isEmpty()){
                        newReady.add(ent.getKey());
                    }
                }
            }
            for(Integer n : newReady){
                map.remove(n);
            }
            noDependent.addAll(newReady);
        }
        
        return map.isEmpty();
    }
}

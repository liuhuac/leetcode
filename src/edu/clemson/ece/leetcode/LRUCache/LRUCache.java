package edu.clemson.ece.leetcode.LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	Map<Integer,Integer> map;
    public LRUCache(int capacity) {
    	final int cap = capacity;
        map = new LinkedHashMap<Integer,Integer>(16, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cap;
            }
        };
    }
    
    public int get(int key) {
    	if(map.containsKey(key)){
            return map.get(key);
        } else {
            return -1;
        }
    }
    
    public void set(int key, int value) {
        map.put(key,value);
    }
}

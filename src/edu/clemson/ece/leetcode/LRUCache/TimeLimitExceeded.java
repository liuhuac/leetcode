package edu.clemson.ece.leetcode.LRUCache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class newLRUCache {
    int cap;
    List<Integer> keys;
    Map<Integer,Integer> map;
    public newLRUCache(int capacity) {
        cap = capacity;
        keys = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            return map.get(key);
        } else {
            return -1;
        }
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)){
            map.remove(key);
            keys.remove((Object)key);
        } else {
            if(keys.size()>=cap) keys.remove(0);
        }
        keys.add(key);
        map.put(key,value);
    }
}

public class TimeLimitExceeded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

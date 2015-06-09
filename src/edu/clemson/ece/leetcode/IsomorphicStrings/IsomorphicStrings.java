package edu.clemson.ece.leetcode.IsomorphicStrings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character,Character> map = new HashMap<Character,Character>();
		map.put('a', 'b');
		map.put('a', 'c');
		
		for( char c : map.keySet()){
			System.out.println(c+ " " +map.get(c));
		}
		
	}

	public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<Character,Character>();
        int l = s.length();
        for(int i=0; i<l; i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(!map.containsKey(cs)){
                if(map.containsValue(ct)){
                    return false;
                }
                map.put(cs,ct);
            } else if (ct!=map.get(cs)){
                return false;
            }
        }
        map.clear();
        return true;
    }
}

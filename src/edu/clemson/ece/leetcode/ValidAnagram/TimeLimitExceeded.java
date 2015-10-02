package edu.clemson.ece.leetcode.ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isAnagram(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            Character c = s.charAt(i);
            int pos = t.indexOf(c);
            if(pos>=0){
                t = t.substring(0,pos)+t.substring(pos+1);
            } else {
                return false;
            }
        }
        return t.length()==0;
    }
}

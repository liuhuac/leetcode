package edu.clemson.ece.leetcode.WordPattern;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "";
		String s2 = "beef";
		WordPattern wp = new WordPattern();
		wp.wordPattern(s1, s2);
	}

	public boolean wordPattern(String pattern, String str) {
        if(pattern.length()==0) return false;
        String[] p = pattern.split("");
        String[] s = str.split(" ");
        if(p.length!=s.length) return false;
        Map<String,String> m = new HashMap<>();
        for(int i=0; i<p.length; i++){
            if(m.containsKey(p[i])){
                if(!(s[i]).equals(m.get(p[i]))) return false;
            } else if(m.containsValue(s[i])){
                return false;
            } else {
                m.put(p[i],s[i]);
            }
        }
        return true;
    }
}

package edu.clemson.ece.leetcode.MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String minWindow(String s, String t) {
        Map<Character,Integer> require = new HashMap<>();
        int count = t.length();
        int minW = Integer.MAX_VALUE;
        int minId = 0;
        int start = 0;
        for(int i=0; i<count; i++){
            char c = t.charAt(i);
            if(require.containsKey(c)){
                require.put(c,require.get(c)+1);
            } else {
                require.put(c,1);
            }
        }
        int end = -1;
        while(end<s.length()){
            if(count==0){
                if(minW>end-start+1){
                    minW=end-start+1;
                    minId=start;
                } 
                char c = s.charAt(start);
                if(require.containsKey(c)){
                    int tmp = require.get(c);
                    if(tmp==0) count++;
                    require.put(c,tmp+1);
                }
                start++;
            } else {
                end++;
                if(end==s.length()) break; // attention
                char c = s.charAt(end);
                if(require.containsKey(c)){
                    int tmp = require.get(c);
                    if(tmp>0) count--;
                    require.put(c,tmp-1);
                }
            }
        }
        if(minW==Integer.MAX_VALUE) return ""; // attention
        return s.substring(minId,minId+minW);
    }
}

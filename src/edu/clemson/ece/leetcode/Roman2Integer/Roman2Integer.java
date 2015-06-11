package edu.clemson.ece.leetcode.Roman2Integer;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int romanToInt(String s) {
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        
        int len = s.length();
        int cur = 0;
        int cv = 0;
        int nv = 0;
        int result = 0;
        
        while(cur<len){
            cv = m.get(s.charAt(cur));
            if(cur+1<len) nv = m.get(s.charAt(cur+1));
            if(cv<nv) {
                result -= cv;
            } else {
                result += cv;
            }
            cur++;
        }
        
        return result;
    }
}

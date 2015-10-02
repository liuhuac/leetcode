package edu.clemson.ece.leetcode.ValidAnagram;

import java.util.Arrays;

public class ValidAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        s = new String(sa);
        t = new String(ta);
        return s.equals(t);
    }
}

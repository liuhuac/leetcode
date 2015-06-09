package edu.clemson.ece.leetcode.LongestSubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "C";
		LongestSubstring ls = new LongestSubstring();
		System.out.println(ls.lengthOfLongestSubstring(s));
	}

	public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;
        char[] array = s.toCharArray();
        Set<Character> hashset = new HashSet<Character>();
        while(right<array.length){
            if(!hashset.add(array[right])){
                if(max < right-left){
                    max = right-left;
                }
                while(!hashset.add(array[right])){
                    hashset.remove(array[left++]);
                }
            }
            right++;
        }
        if(max < right-left){
            max = right-left;
        }
        return max;
    }
}

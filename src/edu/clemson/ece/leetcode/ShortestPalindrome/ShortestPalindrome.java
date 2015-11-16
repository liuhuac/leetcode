package edu.clemson.ece.leetcode.ShortestPalindrome;

public class ShortestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String shortestPalindrome(String s) {
        if(s.length()<=1) return s;
        String new_s = s + "#" + new StringBuilder(s).reverse().toString();
        int[] pos = new int[new_s.length()];
        for(int i=1; i<new_s.length(); i++){
            int j = pos[i-1];
            while(j>0 && new_s.charAt(j)!=new_s.charAt(i)) j=pos[j-1];
            pos[i] = j + (new_s.charAt(j)==new_s.charAt(i) ? 1 : 0); // j
        }
        return new StringBuilder(s.substring(pos[new_s.length()-1])).reverse().toString() + s;
    }
}

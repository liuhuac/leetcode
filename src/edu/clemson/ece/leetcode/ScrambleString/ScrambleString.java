package edu.clemson.ece.leetcode.ScrambleString;

public class ScrambleString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isScramble(String s1, String s2) {
        if(s1.equals(s2)) return true;
        
        int[] chars = new int[26];
        for(int i=0; i<s1.length(); i++){
            chars[s1.charAt(i)-'a']++;
            chars[s2.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++) if(chars[i]!=0) return false;
        
        for(int i=1; i<s1.length(); i++){ // attention NOT i<=s1.length()
            if(isScramble(s1.substring(0,i),s2.substring(0,i)) &&
                isScramble(s1.substring(i),s2.substring(i))) return true;
            if(isScramble(s1.substring(0,i),s2.substring(s2.length()-i)) && // attention
                isScramble(s1.substring(i),s2.substring(0,s2.length()-i))) return true;
        }
        
        return false;
    }
}

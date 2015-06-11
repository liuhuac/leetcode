package edu.clemson.ece.leetcode.ImplementStrStr;

public class ImplementStrStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int strStr(String haystack, String needle) {
        if(0==needle.length()) return 0;
        if(0==haystack.length()) return -1;
        
        for(int i=0; i<haystack.length(); i++){
            if(check(haystack, i, needle)) return i;
        }
        return -1;
    }
    
    public boolean check(String haystack, int begin, String needle){
        if(haystack.length()-begin < needle.length()) return false;
        for(int i=0; i<needle.length(); i++){
            if(haystack.charAt(begin+i) != needle.charAt(i)) return false;
        }
        return true;
    }
}

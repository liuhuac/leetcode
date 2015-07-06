package edu.clemson.ece.leetcode.ReverseWordsInAString;

public class ReverseWordsInAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsInAString rs = new ReverseWordsInAString();
		rs.reverseWords("a");
	}
	public String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ");
        if(0==s.length()) return "";
        if(' '==s.charAt(0)) s = s.substring(1);
        if(0==s.length()) return "";
        if(' '==s.charAt(s.length()-1)) s = s.substring(0,s.length()-1);
        String[] strs = s.split("\\s");
        String res = "";
        for(int i=strs.length-1; i>=0; i--) res += strs[i] + " ";
        res = res.substring(0,res.length()-1);
        return res;
   }
}

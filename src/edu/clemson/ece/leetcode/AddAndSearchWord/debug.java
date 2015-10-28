package edu.clemson.ece.leetcode.AddAndSearchWord;

public class debug {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordDictionary wd = new WordDictionary();
		wd.addWord("a");
		wd.addWord("a");
		wd.search(".");
		wd.search("a");
		wd.search("aa");
		wd.search("a");
		wd.search(".a");  
		wd.search("a.");
	}

}

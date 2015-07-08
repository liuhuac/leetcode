package edu.clemson.ece.leetcode.WordBreak;

import java.util.Set;

public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String str = s.substring(0,1)+s.charAt(1);
		System.out.print(str);
	}
	public boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] check = new boolean[s.length()];
        for(int i=0; i<s.length(); i++){
            if(wordDict.contains(s.substring(0,i)+s.charAt(i))){
                check[i] = true;
                continue;
            }
            for(int j=0; j<i; j++){
                if(check[j]){
                    String str = s.substring(j+1, i)+s.charAt(i);
                    if(wordDict.contains(str)){
                        check[i] = true;
                        break;
                    }
                }
            }
        }
        return check[s.length()-1];
    }
}

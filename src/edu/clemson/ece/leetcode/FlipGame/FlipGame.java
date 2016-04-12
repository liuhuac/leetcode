package edu.clemson.ece.leetcode.FlipGame;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> generatePossibleNextMoves(String s) {
        List<String> ans = new ArrayList<>();
        int p = 1;
        while(p<s.length()){
            if(s.charAt(p-1)=='+' && s.charAt(p)=='+'){
                ans.add(s.substring(0,p-1)+"--"+s.substring(p+1));
            }
            p++;
        }
        return ans;
    }
}

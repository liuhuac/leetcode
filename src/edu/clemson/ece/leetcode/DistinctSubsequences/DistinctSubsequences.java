package edu.clemson.ece.leetcode.DistinctSubsequences;

public class DistinctSubsequences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int numDistinct(String s, String t) {
        //if(s.length()==0) return 0;
        int[][] dp = new int[t.length()+1][s.length()+1];
        for(int j=0; j<s.length()+1; j++) dp[0][j] = 1;
        for(int i=1; i<t.length()+1; i++){
            for(int j=1; j<s.length()+1; j++){
                if(t.charAt(i-1)==s.charAt(j-1)){ // attention
                    dp[i][j] = dp[i][j-1] + dp[i-1][j-1];
                } else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[t.length()][s.length()];
    }
}

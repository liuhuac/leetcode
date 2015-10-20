package edu.clemson.ece.leetcode.MaximalSquare;

public class MaximalSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        if(0==n) return 0;
        int m = matrix[0].length;
        int[][] dp = new int[n+1][m+1];
        int ans = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1]) + 1;
                    ans = Math.max(dp[i][j],ans);
                }
            }
        }
        return ans*ans;
    }
}

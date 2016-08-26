package edu.clemson.ece.leetcode.GuessNumberHigherOrLowerII;

public class GuessNumberHigherOrLowerII {
    public int getMoneyAmount(int n) {
        if(n==1) return 0;
        int[][] dp = new int[n+2][n+2];
        
        /* dp[i][j] = k+Math.max(dp[i][k-1],dp[k+1][j])
	 * For first dimension [i], we need to know [k+1] which is larger
	 * so, this dimension should be calculated form n->0
	 * For second simension [j], we need to know [k-1] which is smaller
	 * so, this dimension should be calculated from 0->n
	 **/
        
        for(int i=n; i>=1; i--){
            for(int j=i+1; j<=n; j++){
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i; k<=j; k++){
                    if(k+Math.max(dp[i][k-1],dp[k+1][j])<dp[i][j]){
                        dp[i][j] = k+Math.max(dp[i][k-1],dp[k+1][j]);
                    }
                }
            }
        }
        return dp[1][n];
    }
}

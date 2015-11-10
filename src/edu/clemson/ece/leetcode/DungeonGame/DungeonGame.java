package edu.clemson.ece.leetcode.DungeonGame;

public class DungeonGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length+1][dungeon[0].length+1];
        
        for(int i=0; i<dp.length; i++) dp[i][dungeon[0].length]=Integer.MAX_VALUE;
        for(int j=0; j<dp[0].length; j++) dp[dungeon.length][j]=Integer.MAX_VALUE;
        dp[dungeon.length][dungeon[0].length-1] = 1;
        dp[dungeon.length-1][dungeon[0].length] = 1;
        
        for(int i=dp.length-2; i>=0; i--){
            for(int j=dp[0].length-2; j>=0; j--){
                dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1])-dungeon[i][j];
                if(dp[i][j]<=0) dp[i][j]=1;
            }
        }
        return dp[0][0];
    }
}

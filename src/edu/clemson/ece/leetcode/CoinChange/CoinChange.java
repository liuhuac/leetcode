package edu.clemson.ece.leetcode.CoinChange;

public class CoinChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[] ans = new int[amount+1];
        for(int i=1; i<=amount; i++){
            int curMin = Integer.MAX_VALUE;
            for(int coin : coins){
                if(i>coin && ans[i-coin]!=0){
                    ans[i] = Math.min(ans[i-coin]+1, curMin);
                    curMin = ans[i];
                } else if (i==coin) {
                    ans[i] = 1;
                    break;
                }
            }
        }
        return ans[amount]==0 ? -1 : ans[amount];
    }
}

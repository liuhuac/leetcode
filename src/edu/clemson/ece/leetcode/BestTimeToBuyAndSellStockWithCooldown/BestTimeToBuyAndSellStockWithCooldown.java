package edu.clemson.ece.leetcode.BestTimeToBuyAndSellStockWithCooldown;

public class BestTimeToBuyAndSellStockWithCooldown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices) {
        int profitSell = 0;
        int profitNone = 0;
        for(int i=1; i<prices.length; i++){
            int copy = profitSell;
            profitSell = Math.max(profitSell+prices[i]-prices[i-1], profitNone);
            profitNone = Math.max(profitNone, copy);
        }
        return Math.max(profitNone, profitSell);
    }
}

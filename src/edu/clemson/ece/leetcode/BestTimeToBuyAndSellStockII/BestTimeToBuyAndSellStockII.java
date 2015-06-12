package edu.clemson.ece.leetcode.BestTimeToBuyAndSellStockII;

public class BestTimeToBuyAndSellStockII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices) {
        if(1>=prices.length) return 0;
        int max = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                max = max + (prices[i] - prices[i-1]);
            }
        }
        return max;
    }
}

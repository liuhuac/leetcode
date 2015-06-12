package edu.clemson.ece.leetcode.BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices) {
        if(1>=prices.length) return 0;
        int max = 0, min = prices[0];
        for(int i=0; i<prices.length; i++){
            int diff = prices[i]-min;
            if(0>diff) {
                min = prices[i];
            } else if (0<diff) {
                if(diff>max) max = diff;
            }
        }
        return max;
    }
}

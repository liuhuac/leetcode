package edu.clemson.ece.leetcode.BestTimeToBuyAndSellStockIII;

public class BestTimeToBuyAndSellStockIII_DP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices) {
        int k=2;
        int[] maxProfit = new int[k+1];
        int[] lowPrice = new int[k+1];
        for(int i=0; i<lowPrice.length; i++) lowPrice[i]=Integer.MAX_VALUE;
        for(int p : prices){
            for(int i=k; i>=1; i--){
                maxProfit[i] = Math.max(maxProfit[i],p-lowPrice[i]);
                lowPrice[i] = Math.min(lowPrice[i],p-maxProfit[i-1]);
            }
        }
        return maxProfit[k];
    }
}

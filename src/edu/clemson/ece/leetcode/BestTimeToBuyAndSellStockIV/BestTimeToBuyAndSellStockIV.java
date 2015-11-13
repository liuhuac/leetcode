package edu.clemson.ece.leetcode.BestTimeToBuyAndSellStockIV;

public class BestTimeToBuyAndSellStockIV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int k, int[] prices) {
        if(k>=prices.length/2){
            int maxProfit = 0;
            for(int i=1; i<prices.length; i++){
                if(prices[i]>prices[i-1]) maxProfit += prices[i]-prices[i-1];
            }
            return maxProfit;
        }
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

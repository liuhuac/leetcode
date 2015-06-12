package edu.clemson.ece.leetcode.BestTimeToBuyAndSellStockIII;

public class BestTimeToBuyAndSellStockIII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProfit(int[] prices) {
        if(1>=prices.length) return 0;
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        left = initLeft(prices, left);
        right = initRight(prices, right);
        int max = 0;
        for(int i=0; i<prices.length; i++){
            int sum = 0;
            if(prices.length-1==i) {
                sum = left[i];
            } else {
                sum = left[i] + right[i+1];
            }
            if(max<sum) max = sum;
        }
        return max;
    }
    public int[] initLeft(int[] prices, int[] left){
        int min = prices[0];
        left[0] = 0;
        for(int i=1; i<prices.length; i++){
            if(min>prices[i]) min = prices[i];
            if((prices[i]-min)>left[i-1]){
                left[i] = prices[i]-min;
            } else {
                left[i] = left[i-1];
            }
        }
        return left;
    }
    public int[] initRight(int[] prices, int[] right){
        int max = prices[prices.length-1];
        right[prices.length-1] = 0;
        for(int i=prices.length-2; i>=0; i--){
            if(max<prices[i]) max = prices[i];
            if((max-prices[i])>right[i+1]){
                right[i] = max-prices[i];
            } else {
                right[i] = right[i+1];
            }
        }
        return right;
    }
}

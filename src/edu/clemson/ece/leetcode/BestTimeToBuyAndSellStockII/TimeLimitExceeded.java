package edu.clemson.ece.leetcode.BestTimeToBuyAndSellStockII;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TimeLimitExceeded {

	public static int[] prices = null;
	
	public static void readFile(){
		File f = new File("src/edu/clemson/ece/leetcode/BestTimeToBuyAndSellStockII/prices");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s = br.readLine();
			br.close();
			String[] list = s.split("\\,");
			int[] array = new int[list.length];
			int i = 0;
			for(String e : list){
				array[i] = Integer.valueOf(e);
			}
			prices = array;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeLimitExceeded tle = new TimeLimitExceeded();
		readFile();
		System.out.println(tle.maxProfit(prices));
	}

	public int maxProfit(int[] prices) {
        return maxProfitBetween(prices, 0, prices.length-1);
    }
    
    public int maxProfitBetween(int[] prices, int from, int to){
        if(from>=to) return 0;
        int p = peekBetween(prices, from, to);
        int profit = 0;
        for(int i=from; i<p; i++){
            profit += prices[p] - prices[i];
        }
        return profit + maxProfitBetween(prices, p+1, to);
    }
    
    public int peekBetween(int[] prices, int from, int to){
        int p = from;
        for(int i=from; i<=to; i++){
            if(prices[i]>prices[p]) p = i;
        }
        return p;
    }
}

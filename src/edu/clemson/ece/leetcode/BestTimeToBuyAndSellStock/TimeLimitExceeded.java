package edu.clemson.ece.leetcode.BestTimeToBuyAndSellStock;

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
				i++;
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
        int max = 0;
        for(int i=0; i<prices.length-1; i++){
            int nm = nextMax(prices, i+1, prices.length-1);
            int diff = nm - prices[i];
            if(0 < diff && max < diff){
                max = diff;
            }
        }
        return max;
    }
    
    public int nextMax(int[] prices, int l, int r) {
        int max = prices[l];
        while(l<=r){
            if(prices[l]>max){
                max = prices[l];
            }
            l++;
        }
        return max;
    }
}

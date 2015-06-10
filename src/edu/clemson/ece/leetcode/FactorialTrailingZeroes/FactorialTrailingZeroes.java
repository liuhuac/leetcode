package edu.clemson.ece.leetcode.FactorialTrailingZeroes;

public class FactorialTrailingZeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int trailingZeroes(int n) {
        if(5>n){
            return 0;
        }
        int order = (int)(Math.log(n)/Math.log(5));
        int result = 0;
        for(int i=1; i<=order; i++){
            result += n/Math.pow(5,i);
        }
        return result;
    }
}

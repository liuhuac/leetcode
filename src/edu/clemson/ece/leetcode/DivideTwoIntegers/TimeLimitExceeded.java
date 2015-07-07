package edu.clemson.ece.leetcode.DivideTwoIntegers;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Last executed input: 2147483647, 1
		int test = -2147483648;
		System.out.print(Math.abs(test));
	}
	public int divide(int dividend, int divisor) {
        boolean nagative = (dividend<0)&&(divisor>0) || (dividend>0)&&(divisor<0);
        if(dividend<0) dividend = -dividend;
        if(divisor<0) divisor = -divisor;
        int ans = 0;
        while(dividend>=divisor){
            int quo = 1;
            int newdivisor = divisor;
            while(dividend>=newdivisor){
                newdivisor <<= 1;
                quo <<= 1;
            }
            dividend -= (newdivisor >>> 1);
            ans += (quo >>> 1);
        }
        return nagative ? -ans : ans;
    }
}

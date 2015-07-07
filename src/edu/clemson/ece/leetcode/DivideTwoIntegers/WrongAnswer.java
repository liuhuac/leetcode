package edu.clemson.ece.leetcode.DivideTwoIntegers;

public class WrongAnswer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrongAnswer di = new WrongAnswer();
		//di.divide(-2147483648, 1);
		//System.out.print(di.divide(2147483647, 1));
		System.out.print(di.divide(2147483647, 2));
	}
	public int divide(int dividend, int divisor) {
        boolean nagative = (dividend<0)&&(divisor>0) || (dividend>0)&&(divisor<0);
        int ans = 0;
        if(dividend==Integer.MIN_VALUE && divisor==Integer.MIN_VALUE){
            return 1;
        } else if(dividend==Integer.MIN_VALUE){
        	/*if(1==divisor){
                return dividend;
            } else if (-1==divisor){
                return Integer.MAX_VALUE;
            }*/
            ans = 1;
            dividend += Math.abs(divisor);
        } else if(divisor==Integer.MIN_VALUE){
            return 0;
        }
        if(dividend<0) dividend = -dividend;
        if(divisor<0) divisor = -divisor;
        while(dividend>=divisor){ //  &&dividend>0&&divisor>0
            int quo = 1;
            int newdivisor = divisor;
            while(dividend>=newdivisor&&dividend>0){ // &&dividend>0&&newdivisor>0
                dividend -= newdivisor;
                ans += quo;
                newdivisor <<= 1;
                quo <<= 1;
            }
        }
        return nagative ? -ans : ans;
    }
}

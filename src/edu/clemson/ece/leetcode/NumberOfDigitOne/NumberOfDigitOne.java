package edu.clemson.ece.leetcode.NumberOfDigitOne;

public class NumberOfDigitOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int countDigitOne(int n) {
        int limit = Integer.MAX_VALUE/10;
        int ones = 0;
        for(int i=1; i<=n; i*=10){
            int left = n/i;
            int right = n%i;
            ones += (left+8)/10*i + (left%10==1 ? right+1 : 0);
            if(i>limit) break;
        }
        return ones;
    }
}

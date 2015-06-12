package edu.clemson.ece.leetcode.NumberOf1Bits;

public class NumberOf1Bits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0; i<32; i++){
            if((n & 1) == 1) count++;
            n = n>>>1;
        }
        return count;
    }
}

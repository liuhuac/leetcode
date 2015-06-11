package edu.clemson.ece.leetcode.ReverseBits;

public class ReverseeBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i=0; i<32; i++){
            result = (result<<1) | (n & 1);
            n = n>>>1;
        }
        return result;
    }

}

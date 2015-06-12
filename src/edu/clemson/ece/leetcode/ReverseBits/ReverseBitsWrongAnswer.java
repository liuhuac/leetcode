package edu.clemson.ece.leetcode.ReverseBits;

public class ReverseBitsWrongAnswer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseBitsWrongAnswer rb = new ReverseBitsWrongAnswer();
		System.out.println(rb.reverseBits(0x80000000));// input 2147483648 (10000000000000000000000000000000)

	}

	// you need treat n as an unsigned value
    public int reverseBits(int n) {
        String bits = "";
        for(int i=0; i<32; i++){
            bits += n%2;
            n /= 2;
        }
        int result = 0;
        for(int i=0; i<32; i++){
            int b = '1'==bits.charAt(i) ? 1 : 0;
            result = result * 2 + b;
        }
        return result;
    }
}

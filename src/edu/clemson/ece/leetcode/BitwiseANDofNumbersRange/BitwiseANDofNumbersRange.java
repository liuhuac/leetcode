package edu.clemson.ece.leetcode.BitwiseANDofNumbersRange;

public class BitwiseANDofNumbersRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int rangeBitwiseAnd(int m, int n) {
        int diff = 0;
        while(m!=n){
            m >>= 1;
            n >>= 1;
            diff++;
        }
        return m <<= diff;
    }
}

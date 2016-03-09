package edu.clemson.ece.leetcode.PowerOfThree;

public class PowerOfThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n%3==0) n/=3;
        return n==1;
    }
}

package edu.clemson.ece.leetcode.PowerOfTwo;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPowerOfTwo(int n) {
        if(0>=n) return false;
        while(0==n%2) n /= 2;
        if(1==n) return true;
        return false;
    }
}

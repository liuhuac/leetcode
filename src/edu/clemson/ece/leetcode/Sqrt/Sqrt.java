package edu.clemson.ece.leetcode.Sqrt;

public class Sqrt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqrt s = new Sqrt();
		System.out.print(s.mySqrt(2147395599));
	}

	public int mySqrt(int y) {

        //initial guess
        long x = y >> 1;

        //see explanations below.
        for (long dy; (dy = x * x - y) > 0; x -= (dy - 1) / (x << 1) + 1);

        //x must be ⌊√y⌋ here, except when y == 1
        return y == 1 ? 1 : (int)x;
    }
	
}

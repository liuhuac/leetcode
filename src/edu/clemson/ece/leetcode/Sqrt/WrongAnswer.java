package edu.clemson.ece.leetcode.Sqrt;

public class WrongAnswer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrongAnswer s = new WrongAnswer();
		System.out.print(s.mySqrt(2147395599));
	}

	public int mySqrt(int x) {
        if(1==x) return 1;
        int r = x / 2; //************************ long r
        int d = r * r - x; //******************** r*r > Integer.MAX_VALUE
        while(d>0){
            r -= (d - 1)/ (r << 1) + 1;
            d = r * r - x;
        }
        return r;
    }
}

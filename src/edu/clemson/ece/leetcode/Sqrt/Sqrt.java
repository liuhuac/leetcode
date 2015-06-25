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

	public int mySqrt(int x) {
        if(1==x) return 1;
        int r = x / 2;
        int d = r * r - x;
        while(d>0){
            r -= (d - 1)/ (r << 1) + 1;
            d = r * r - x;
        }
        return r;
    }
	
}

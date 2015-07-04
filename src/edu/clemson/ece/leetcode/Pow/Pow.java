package edu.clemson.ece.leetcode.Pow;

public class Pow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pow pow = new Pow();
		System.out.print(pow.myPow(8.84372, -5));
	}

	public double myPow(double x, int n) {
        double res = 1;
        if(0>n){
            x = 1/x;
            n = -n;
        }
        while(n>0){
            if(n%2==1){
                res *= x;
            }
            x *= x;
            n /=2;
        }
        return res;
    }
}

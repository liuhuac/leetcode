package edu.clemson.ece.leetcode.UglyNumber;

public class UglyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isUgly(int num) {
        if(1==num) return true;
        if(0==num) return false;
        while(num%2==0) {
            num /=2;
            if(1==num) return true;
        }
        while(num%3==0) {
            num /=3;
            if(1==num) return true;
        }
        while(num%5==0) {
            num /=5;
            if(1==num) return true;
        }
        return false;
    }
}

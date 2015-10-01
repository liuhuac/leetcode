package edu.clemson.ece.leetcode.AddDigits;

public class AddDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int addDigits(int num) {
        if(num==0) return 0;
        int remain = num % 9;
        return remain==0 ? 9 : remain;
    }
}

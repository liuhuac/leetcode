package edu.clemson.ece.leetcode.SingleNumber;

public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int singleNumber(int[] nums) {
        int a = 0;
        for(int i : nums){
            a ^= i;
        }
        return a;
    }
}

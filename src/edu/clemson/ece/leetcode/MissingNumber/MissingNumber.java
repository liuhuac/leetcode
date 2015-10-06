package edu.clemson.ece.leetcode.MissingNumber;

public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int missingNumber(int[] nums) {
        int sum = 0;
        int miss = 0;
        for(int i=0; i<nums.length; i++){
            sum += i+1;
            miss += nums[i];
        }
        return sum-miss;
    }
}

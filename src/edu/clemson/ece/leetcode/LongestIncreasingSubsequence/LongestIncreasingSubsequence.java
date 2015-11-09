package edu.clemson.ece.leetcode.LongestIncreasingSubsequence;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for(int x : nums){
            int i = Arrays.binarySearch(dp,0,len,x);
            if(i<0) i = -(i+1);
            dp[i] = x;
            if(i==len) len++;
        }
        return len;
    }
}

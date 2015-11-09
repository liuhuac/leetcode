package edu.clemson.ece.leetcode.LongestIncreasingSubsequence;

public class LongestIncreasingSubsequence_On2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestIncreasingSubsequence_On2 lis = new LongestIncreasingSubsequence_On2();
		int[] nums = new int[]{1,3,6,7,9,4,10,5,6};
		lis.lengthOfLIS(nums);
	}
	public int lengthOfLIS(int[] nums) {
        if(nums.length==0) return 0;
        int[] dp = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int max = 1; // attention
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]) max = Math.max(max,dp[j]+1); // attention  dp[j]+1
            }
            dp[i] = max;
        }
        int max = 1;
        for(int i=0; i<nums.length; i++) max = Math.max(max,dp[i]); // attention
        return max;
    }
}

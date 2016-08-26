package edu.clemson.ece.leetcode.CombinationSumIV;

public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int i=1; i<dp.length; i++){
            for(int n : nums){
                if(i-n>=0)
                    dp[i] += dp[i-n];
            }
        }
        return dp[target];
    }
}

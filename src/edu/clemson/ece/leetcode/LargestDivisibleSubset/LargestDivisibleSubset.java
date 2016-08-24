package edu.clemson.ece.leetcode.LargestDivisibleSubset;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[] dp = new int[nums.length];
        int[] next = new int[nums.length]; /* auxiliary */
        int max = 0;
        int maxIdx = 0;
        
        Arrays.sort(nums);
        
        for(int i=nums.length-1; i>=0; i--){
            for(int j=i; j<nums.length; j++){
                if(nums[j]%nums[i]==0 && dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                    next[i] = j;
                }
            }
            if(max<dp[i]){
                max = dp[i];
                maxIdx = i;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<max; i++){
            res.add(nums[maxIdx]);
            maxIdx = next[maxIdx];
        }
        return res;
    }
}

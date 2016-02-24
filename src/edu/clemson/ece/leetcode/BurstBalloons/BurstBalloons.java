package edu.clemson.ece.leetcode.BurstBalloons;

public class BurstBalloons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxCoins(int[] nums) {
        int[] numbers = new int[nums.length+2];
        int n = 1;
        for(int x : nums){
            if(x!=0) numbers[n++] = x;
        }
        numbers[0] = numbers[n++] = 1;
        
        int[][] memo = new int[n][n];
        return maxCoins(memo, numbers, 0, n-1);
    }
    
    public int maxCoins(int[][] memo, int[] nums, int left, int right){
        if(left+1==right) return 0;
        if(memo[left][right]!=0) return memo[left][right];
        int ans = 0;
        for(int i=left+1; i<right; i++){
            ans = Math.max(ans, nums[left]*nums[i]*nums[right]+maxCoins(memo, nums, left, i)+maxCoins(memo, nums, i, right));
        }
        memo[left][right] = ans;
        return ans;
    }
}

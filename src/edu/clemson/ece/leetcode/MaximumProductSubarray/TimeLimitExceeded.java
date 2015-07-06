package edu.clemson.ece.leetcode.MaximumProductSubarray;

public class TimeLimitExceeded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int cur = 1;
            for(int j=i; j>=0; j--){
                cur *= nums[j];
                if(cur>max) max = cur;
            }
        }
        return max;
    }
}

package edu.clemson.ece.leetcode.MaximumProductSubarray;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int cur = 1;
        for(int i=0; i<nums.length; i++){
            cur *= nums[i];
            if(cur>max) max = cur;
            if(0==nums[i]) cur = 1;
        }
        cur = 1;
        for(int i=nums.length-1; i>=0; i--){
            cur *= nums[i];
            if(cur>max) max = cur;
            if(0==nums[i]) cur = 1;
        }
        return max;
    }
}

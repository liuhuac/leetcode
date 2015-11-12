package edu.clemson.ece.leetcode.RangeSumQueryImmutable;

public class FirstAttempt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class NumArray {
	    
	    int[] nums = null;

	    public NumArray(int[] nums) {
	        this.nums = nums;
	        // this.nums = new int[nums.length];
	        // for(int i=0; i<nums.length; i++)
	        //     this.nums[i] = nums[i];
	    }

	    public int sumRange(int i, int j) {
	        int sum = 0;
	        for(int k=i; k<=j; k++) sum += nums[k];
	        return sum;
	    }
	}
}

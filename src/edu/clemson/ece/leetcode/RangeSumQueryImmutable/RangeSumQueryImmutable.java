package edu.clemson.ece.leetcode.RangeSumQueryImmutable;

public class RangeSumQueryImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class NumArray {
	    
	    int[] sum = null;

	    public NumArray(int[] nums) {
	        sum = new int[nums.length];
	        if(nums.length>0) sum[0]=nums[0];
	        for(int i=1; i<nums.length; i++)
	            sum[i] = sum[i-1] + nums[i];
	    }

	    public int sumRange(int i, int j) {
	        return i==0 ? sum[j] : sum[j]-sum[i-1];
	    }
	}


	// Your NumArray object will be instantiated and called as such:
	// NumArray numArray = new NumArray(nums);
	// numArray.sumRange(0, 1);
	// numArray.sumRange(1, 2);
}

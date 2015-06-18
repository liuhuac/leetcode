package edu.clemson.ece.leetcode.MaximumSubarray;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxSubArray(int[] nums) {
        if(0==nums.length){
            return 0;
        }
        int max = nums[0];
        int pre = nums[0];
        for(int i=1; i<nums.length; i++){
            if(pre>0){
                pre = pre + nums[i];
            } else {
                pre = nums[i];
            }
            max = Math.max(pre,max);
        }
        return max;
    }
}

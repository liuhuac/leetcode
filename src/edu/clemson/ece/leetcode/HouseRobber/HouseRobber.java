package edu.clemson.ece.leetcode.HouseRobber;

public class HouseRobber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int rob(int[] nums) {
        if(0==nums.length){
            return 0;
        }
        if(1==nums.length){
            return nums[0];
        }
        int[] max = new int[nums.length];
        max[0] = nums[0];
        max[1] = Math.max(nums[0],nums[1]);
        for(int i=2; i<max.length; i++){
            max[i] = Math.max(max[i-2]+nums[i], max[i-1]);
        }
        return max[max.length-1];
    }
}

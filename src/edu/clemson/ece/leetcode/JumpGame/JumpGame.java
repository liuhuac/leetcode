package edu.clemson.ece.leetcode.JumpGame;

public class JumpGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean canJump(int[] nums) {
        int end = nums[0];
        for(int i=0; i<=end && end<nums.length; i++) if(i+nums[i]>end) end = i+nums[i];
        return end>=nums.length-1 ? true : false;
    }
}

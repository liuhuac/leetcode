package edu.clemson.ece.leetcode.JumpGame;

public class StackOverflowError {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean canJump(int[] nums) {
        return canJump(nums, nums.length-1);
    }
    public boolean canJump(int[] nums, int d) {
        if(0==d) return true;
        for(int i=d-1; i>=0; i--){ // more efficient to scan from back to front
            if(i+nums[i]==d){
                return canJump(nums, i);
            }
        }
        return false;
    }
}

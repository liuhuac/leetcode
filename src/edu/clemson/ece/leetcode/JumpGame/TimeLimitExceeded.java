package edu.clemson.ece.leetcode.JumpGame;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean canJump(int[] nums) {
        boolean[] reach = new boolean[nums.length];
        reach[0] = true;
        for(int i=0; i<nums.length; i++){
            if(reach[i] && i+nums[i]>=nums.length-1) return true;
            if(reach[i]) for(int j=i+1; j<=i+nums[i]; j++) reach[j] = true;
        }
        return reach[nums.length-1];
    }
}

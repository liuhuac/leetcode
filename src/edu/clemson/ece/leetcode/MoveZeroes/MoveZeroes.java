package edu.clemson.ece.leetcode.MoveZeroes;

public class MoveZeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void moveZeroes(int[] nums) {
        if(nums.length<2) return;
        int left = 0;
        int right = 1;
        while(right<nums.length){
            while(left<nums.length&&nums[left]!=0) left++;
            if(left>=nums.length-1) break;
            
            if(right<=left) right = left + 1;
            
            while(right<nums.length&&nums[right]==0) right++;
            if(right==nums.length) break;

            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;

            left++;
            right++;
            
        }
    }
}

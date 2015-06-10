package edu.clemson.ece.leetcode.RotateArray;

public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void rotate(int[] nums, int k) {
        k = k % nums.length;
        nums = reverse(nums, 0, nums.length-k-1);
        nums = reverse(nums, nums.length-k, nums.length-1);
        nums = reverse(nums, 0, nums.length-1);
    }
	
    public int[] reverse(int[] nums, int l, int r){
        while(l<r){
            int tmp = nums[r];
            nums[r] = nums[l];
            nums[l] = tmp;
            l++;
            r--;
        }
        return nums;
    }

}

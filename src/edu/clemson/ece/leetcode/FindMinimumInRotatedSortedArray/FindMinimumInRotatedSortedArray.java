package edu.clemson.ece.leetcode.FindMinimumInRotatedSortedArray;

public class FindMinimumInRotatedSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length-1);
    }
	
    public int findMin(int[] nums, int l, int r) {
        if(l==r){
            return nums[l];
        }
        if(r==l+1){
            return Math.min(nums[l],nums[r]);
        }
        int mid = l + (r - l)/2;
        if(nums[l]>nums[mid]){
            return findMin(nums, l, mid);
        }
        if(nums[mid]>nums[r]){
            return findMin(nums, mid+1, r);
        }
        return Math.min(nums[l],nums[mid+1]);
    }
}

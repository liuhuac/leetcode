package edu.clemson.ece.leetcode.SearchInRotatedSortedArrayII;

public class SearchInRotatedSortedArrayII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(nums[mid]==target) return true;
            if(nums[left]<nums[mid] || nums[mid]>nums[right]){
                if(nums[mid]>target && target>=nums[left]){
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if(nums[mid]<nums[right] || nums[mid]<nums[left]){
                if(nums[right]>=target && target>nums[mid]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                left++;
            }
        }
        return false;
    }
}

package edu.clemson.ece.leetcode.SearchInRotatedSortedArray;

public class SearchInRotatedSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }
    
    public int search(int[] nums, int target, int l, int r) {
        if(1>=r-l){
            if(nums[l]==target){
                return l;
            } else if(nums[r]==target){
                return r;
            } else {
                return -1;
            }
        }
        int m = l + (r - l)/2;
        if(nums[l]<nums[m]&&nums[r]>nums[m]){
            if(target<nums[l]) {
                return -1;
            } else if(target<nums[m]) {
                return search(nums, target, l, m);
            } else if(target<=nums[r]) {
                return search(nums, target, m, r);
            }
        } else if(nums[l]<nums[m]&&nums[r]<nums[m]){
            if(target<=nums[m]&&target>=nums[l]){
                return search(nums, target, l, m);
            } else if(target<=nums[r]||target>=nums[m]){
                return search(nums, target, m, r);
            }
        } else {
            if(target<=nums[m]||target>=nums[l]){
                return search(nums, target, l, m);
            } else if(target<=nums[r]&&target>=nums[m]){
                return search(nums, target, m, r);
            }
        }
        return -1;
    }

}

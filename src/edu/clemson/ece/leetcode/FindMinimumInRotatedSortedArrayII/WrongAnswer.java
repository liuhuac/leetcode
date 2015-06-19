package edu.clemson.ece.leetcode.FindMinimumInRotatedSortedArrayII;

public class WrongAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length-1);
    }
    
    public int findMin(int[] nums, int l, int r) {
        if(l==r) return nums[l];
        if(1==r-l) return Math.min(nums[l], nums[r]);
        int mid = l + (r - l)/2;
        if(nums[l]>nums[mid]){
            return findMin(nums, l, mid);
        } else if(nums[l]==nums[mid]){
            while(l<mid){
                if(nums[l]==nums[mid]){
                    l++;
                } else if(nums[l]>nums[mid]){
                    return findMin(nums, l, mid);
                } else {
                    return findMin(nums, mid, r);
                }
            }
            return findMin(nums, mid, r);
        } else {
            return findMin(nums, mid, r);
        }
    }
}

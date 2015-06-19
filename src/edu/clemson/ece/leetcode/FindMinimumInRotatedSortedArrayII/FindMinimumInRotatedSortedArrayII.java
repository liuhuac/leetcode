package edu.clemson.ece.leetcode.FindMinimumInRotatedSortedArrayII;

public class FindMinimumInRotatedSortedArrayII {

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
        while(l<mid && (nums[l]==nums[mid])){ l++; }
        while(r>mid && (nums[r]==nums[mid])){ r--; }
        if(l==mid || mid==r) return findMin(nums, l, r);
        if(nums[l]>nums[mid]){
            return findMin(nums, l, mid);
        }
        if(nums[r]<nums[mid]){
            return findMin(nums, mid+1, r);
        }
        return Math.min(nums[l], nums[mid+1]);
    }
}

package edu.clemson.ece.leetcode.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int removeDuplicates(int[] nums) {
        if(0==nums.length) return 0;
        if(1==nums.length) return 1;

        int l = 0;
        int r = 1;
        while(r<nums.length){
            if(nums[l]==nums[r]){
                r++;
            } else {
                l++;
                if(l!=r) nums[l] = nums[r];
                r++;
            }
        }
        
        return l + 1;
    }
}

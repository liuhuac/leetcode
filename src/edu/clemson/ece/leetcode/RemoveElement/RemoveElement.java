package edu.clemson.ece.leetcode.RemoveElement;

public class RemoveElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int removeElement(int[] nums, int val) {
        if(null==nums) return 0;
        int l = 0;
        int r = nums.length - 1;
        while(l<=r){
            if(val!=nums[l]){
                l++;
                continue;
            }
            if(val==nums[r]){
                r--;
                continue;
            }
            if(val==nums[l]){
                nums[l] = nums[r];
                l++;
                r--;
            } else {
                l++;
            }
        }
        return l;
    }
}

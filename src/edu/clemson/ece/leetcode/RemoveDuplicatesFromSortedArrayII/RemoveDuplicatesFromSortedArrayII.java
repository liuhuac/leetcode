package edu.clemson.ece.leetcode.RemoveDuplicatesFromSortedArrayII;

public class RemoveDuplicatesFromSortedArrayII {

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
        int c = 1;
        
        while(r<nums.length){
            if(nums[l]==nums[r]){
                if(0==c){
                    r++;
                } else {
                    c--;
                    nums[++l] = nums[r++];
                }
            } else {
                c = 1;
                nums[++l] = nums[r++];
            }
        }
        
        return l + 1;
    }
}

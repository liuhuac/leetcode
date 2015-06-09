package edu.clemson.ece.leetcode.ContainsDuplicateII;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length && j<=i+k; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}

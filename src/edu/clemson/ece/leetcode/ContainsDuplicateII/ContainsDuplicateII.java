package edu.clemson.ece.leetcode.ContainsDuplicateII;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
            if(i>=k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}

package edu.clemson.ece.leetcode.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(!s.add(nums[i])){
                return true;
            }
        }
        return false;
    }

}

package edu.clemson.ece.leetcode.Permutations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> permute(int[] nums) {
        return permute(nums, nums.length-1);
    }
    
    public List<List<Integer>> permute(int[] nums, int n) {
        if(0==n) {
            List<List<Integer>> t1 = new ArrayList<List<Integer>>();
            List<Integer> t2 = new ArrayList<Integer>();
            t2.add(nums[n]);
            t1.add(t2);
            return t1;
        }
        List<List<Integer>> list = permute(nums, n-1);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for(List<Integer> e : list){
            for(int i=0; i<=e.size(); i++){
                List<Integer> tmp = new ArrayList<Integer>(e);
                tmp.add(i,nums[n]);
                set.add(tmp);
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}

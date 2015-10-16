package edu.clemson.ece.leetcode.PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermutationsII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        return permuteUnique(nums, nums.length);
    }
    public List<List<Integer>> permuteUnique(int[] nums, int n) {
        List<List<Integer>> res = new ArrayList<>();
        if(n==0) {
            res.add(new ArrayList<Integer>());
            return res;
        }
        List<List<Integer>> tmp = permuteUnique(nums, n-1);
        Set<String> cache = new HashSet<>();
        for(List<Integer> list : tmp){
            for(int i=0; i<=list.size(); i++){
                List<Integer> newL = new ArrayList(list);
                newL.add(i,nums[n-1]);
                if(cache.add(newL.toString())){
                    res.add(newL);
                }
            }
        }
        return res;
    }
}

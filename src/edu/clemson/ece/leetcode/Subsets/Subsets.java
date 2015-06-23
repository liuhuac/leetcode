package edu.clemson.ece.leetcode.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsets ss = new Subsets();
		int[] nums = new int[]{4,1,0};
		List<List<Integer>> res = ss.subsets(nums);
		for(List<Integer> l : res){
			System.out.println(l.toString());
		}
	}

	public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i<=nums.length; i++){
            List<List<Integer>> tmp = subsets(nums, i, nums.length);
            res.addAll(tmp);
        }
        return res;
    }
    public List<List<Integer>> subsets(int[] nums, int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(0==k){
        	res.add(new ArrayList<Integer>());
        	return res;
        }
        if(k>n) return res;
        List<List<Integer>> pre1 = subsets(nums, k-1, n-1);
        List<List<Integer>> pre2 = subsets(nums, k, n-1);
        res.addAll(pre2);
        for(List<Integer> l : pre1){
            l.add(nums[n-1]);
            res.add(l);
        }
        return res;
    }
    
}

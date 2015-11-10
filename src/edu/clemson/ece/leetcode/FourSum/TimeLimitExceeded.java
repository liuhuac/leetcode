package edu.clemson.ece.leetcode.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        fourSum(ans, cur, nums, 0, target, 4);
        return ans;
    }
    public void fourSum(List<List<Integer>> ans, List<Integer> cur, int[] nums, int start, int target, int k){
        if(k==0){
            if(target==0) ans.add(cur);
            return;
        }
        for(int i=start; i<nums.length; i++){
            if(nums[i]>target) return;
            if(i!=start&&nums[i]==nums[i-1]) continue;
            cur.add(nums[i]);
            fourSum(ans, cur, nums, i, target-nums[i], --k);
            cur.remove(cur.size()-1);
            k++;
        }
    }
}

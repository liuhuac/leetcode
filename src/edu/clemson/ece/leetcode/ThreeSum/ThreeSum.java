package edu.clemson.ece.leetcode.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = new int[]{-13,5,13,12,-2,-11,-1,12,-3,0,-3,-7,-7,-5,-3,-15,-2,14,14,13,6,-11,-11,5,-15,-14,5,-5,-2,0,3,-8,-10,-7,11,-5,-10,-5,-7,-6,2,5,3,2,7,7,3,-10,-2,2,-12,-11,-1,14,10,-9,-15,-8,-7,-9,7,3,-2,5,11,-13,-15,8,-3,-7,-12,7,5,-2,-6,-3,-10,4,2,-5,14,-3,-1,-10,-3,-14,-4,-3,-7,-4,3,8,14,9,-2,10,11,-10,-4,-15,-9,-1,-1,3,4,1,8,1};
		int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
		ThreeSum ts = new ThreeSum();
		ts.threeSum(nums);
	}
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(nums);
        threeSum(ans, cur, nums, 0, 0, 0);
        return ans;
    }
    public void threeSum(List<List<Integer>> ans, List<Integer> cur, int[] nums, int start, int sum, int k) {
        if(3==k){
            if(0==sum){
                ans.add(new ArrayList<Integer>(cur));
            }
            return;
        }
        for(int i=start; i<nums.length; i++){
            if(nums[i]>sum) break;
            if(i!=start){
                if(nums[i]==nums[i-1]) continue; // very important
            }
            cur.add(nums[i]);
            threeSum(ans, cur, nums, i+1, sum-nums[i], ++k);
            cur.remove(cur.size()-1);
            k--;
        }
    }
}

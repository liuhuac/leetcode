package edu.clemson.ece.leetcode.CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSum cs = new CombinationSum();
		int[] candidates = new int[]{1,2};
		cs.combinationSum(candidates, 1);
	}
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        combinationSum(ans, cur, candidates, target, 0);
        return ans;
    }
    public void combinationSum(List<List<Integer>> ans, List<Integer> cur, int[] candidates, int target, int start) {
        if(0<target){
            for(int i=start; i<candidates.length; i++){
                cur.add(candidates[i]);
                combinationSum(ans, cur, candidates, target-candidates[i], i);
                cur.remove(cur.size()-1);
            }
        } else if(0==target){
            ans.add(new ArrayList<Integer>(cur));
        } 
    }
}

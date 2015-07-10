package edu.clemson.ece.leetcode.CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        combinationSum2(ans, cur, candidates, target, 0);
        return ans;
    }
    public void combinationSum2(List<List<Integer>> ans, List<Integer> cur, int[] candidates, int target, int start) {
        if(0<target){
            for(int i=start; i<candidates.length && candidates[i]<=target; i++){
                if(i!=start){
                    if(candidates[i]==candidates[i-1]) continue;
                }
                cur.add(candidates[i]);
                combinationSum2(ans, cur, candidates, target-candidates[i], i+1);
                cur.remove(cur.size()-1);
            }
        } else if(0==target){
            ans.add(new ArrayList<Integer>(cur));
        }
    }
}

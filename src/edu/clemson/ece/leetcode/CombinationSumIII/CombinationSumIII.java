package edu.clemson.ece.leetcode.CombinationSumIII;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        combinationSum3(ans, cur, k, n, 1);
        return ans;
    }
    public void combinationSum3(List<List<Integer>> ans, List<Integer> cur, int k, int n, int start) {
        if(0<k && 0<n){
            for(int i=start; i<=9; i++){
                cur.add(i);
                combinationSum3(ans, cur, k-1, n-i, i+1);
                cur.remove(cur.size()-1);
            }
        } else if(0==k && 0==n){
            ans.add(new ArrayList<Integer>(cur));
        }
    }
}

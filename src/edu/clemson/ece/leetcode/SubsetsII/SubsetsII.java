package edu.clemson.ece.leetcode.SubsetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubsetsII ss = new SubsetsII();
		int[] nums = new int[]{1,1};
		ss.subsetsWithDup(nums);
	}
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        ans.add(new ArrayList<Integer>());
        int size = 1;
        for(int i=0; i<nums.length; i++){
            List<List<Integer>> list = new ArrayList<>();
            if(0==i){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(nums[i]);
                list.add(tmp);
                size = 1;
            } else if(nums[i]==nums[i-1]){
                for(int j=0; j<size; j++){
                    List<Integer> tmp = new ArrayList<>(ans.get(j));
                    tmp.add(nums[i]);
                    list.add(tmp);
                }
            } else {
                for(int j=0; j<ans.size(); j++){
                    List<Integer> tmp = new ArrayList<>(ans.get(j));
                    tmp.add(nums[i]);
                    list.add(tmp);
                }
                size = list.size();
            }
            list.addAll(ans);
            ans = list;
        }
        return ans;
    }
}

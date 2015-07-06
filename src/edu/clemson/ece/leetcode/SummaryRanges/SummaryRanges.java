package edu.clemson.ece.leetcode.SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if(0==nums.length) return res;
        int pre = 0;
        String s = null;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]+1){
                if(pre==i-1){
                    s = Integer.toString(nums[pre]);
                } else {
                    s = nums[pre] + "->" + nums[i-1];
                }
                res.add(s);
                pre = i;
            }
        }
        if(pre==nums.length-1){
            s = Integer.toString(nums[pre]);
        } else {
            s = nums[pre] + "->" + nums[nums.length-1];
        }
        res.add(s);
        return res;
    }
}

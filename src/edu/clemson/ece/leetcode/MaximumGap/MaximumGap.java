package edu.clemson.ece.leetcode.MaximumGap;

import java.util.Arrays;

public class MaximumGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            min = Math.min(min,n);
            max = Math.max(max,n);
        }
        int[] minArray = new int[nums.length];
        int[] maxArray = new int[nums.length];
        Arrays.fill(minArray,Integer.MAX_VALUE);
        Arrays.fill(maxArray,Integer.MIN_VALUE);
        int gap = (int)Math.ceil(((double)(max-min))/((double)(nums.length-1)));
        if(gap==0) return 0;
        for(int n : nums){
            int id = (n-min)/gap;
            minArray[id] = Math.min(minArray[id],n);
            maxArray[id] = Math.max(maxArray[id],n);
        }
        int ans = 0;
        int pre = min;
        for(int i=0; i<nums.length; i++){
            if(minArray[i]==Integer.MAX_VALUE) continue;
            ans = Math.max(minArray[i]-pre,ans);
            pre = maxArray[i];
        }
        return ans;
    }
}

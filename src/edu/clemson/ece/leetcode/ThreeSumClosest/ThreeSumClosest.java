package edu.clemson.ece.leetcode.ThreeSumClosest;

import java.util.Arrays;

public class ThreeSumClosest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=nums[0]+nums[1]+nums[2];
        for(int i=0; i<nums.length-2; i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int tmp=nums[i]+nums[left]+nums[right];
                if(tmp<target){
                    left++;
                } else if(tmp>target){
                    right--;
                } else {
                    return tmp;
                }
                if(Math.abs(tmp-target)<Math.abs(sum-target)){
                    sum=tmp;
                }
            }
        }
        return sum;
    }
}

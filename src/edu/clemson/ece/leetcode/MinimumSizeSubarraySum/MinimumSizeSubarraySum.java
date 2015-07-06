package edu.clemson.ece.leetcode.MinimumSizeSubarraySum;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minSubArrayLen(int s, int[] nums) {
        int size = nums.length;
        for(int i=0; i<nums.length; i++){
            int range = Math.min(size,i+2);
            int sum = 0;
            for(int j=i; j>=i-range+2; j--){
                sum += nums[j];
                if(sum>=s){
                    size = i - j + 1;
                    break;
                }
            }
        }
        return size==nums.length ? 0 : size;
    }
}

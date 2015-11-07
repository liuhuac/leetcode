package edu.clemson.ece.leetcode.SlidingWindowMaximum;

public class SlidingWindowMaximumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] ans = new int[nums.length-k+1];
        
        if(nums.length==0) return new int[0];
        
        left[0] = nums[0];
        right[nums.length-1] = nums[nums.length-1];
        
        for(int i=1; i<nums.length; i++){
            left[i] = i%k==0 ? nums[i] : Math.max(left[i-1],nums[i]);
            int j = nums.length-i-1;
            right[j] = j%k==k-1 ? nums[j] : Math.max(right[j+1],nums[j]);
        }
        
        for(int i=0; i<ans.length; i++){
            ans[i] = Math.max(left[i+k-1],right[i]);
        }
        
        return ans;
    }
}

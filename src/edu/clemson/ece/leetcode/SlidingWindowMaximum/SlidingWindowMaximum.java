package edu.clemson.ece.leetcode.SlidingWindowMaximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0) return new int[0];
        int[] ans = new int[nums.length-k+1];
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<nums.length; i++){
            while(!q.isEmpty()&&q.peek()<i-k+1) q.poll();
            while(!q.isEmpty()&&nums[q.peekLast()]<=nums[i]) q.pollLast();
            q.offer(i);
            if(i>=k-1) ans[i-k+1] = nums[q.peek()];
        }
        return ans;
    }
}

package edu.clemson.ece.leetcode.LargestRectangleInHistogram;

import java.util.Stack;

public class LargestRectangleInHistogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestRectangleInHistogram lrh = new LargestRectangleInHistogram();
		int[] h = new int[]{4,2};
		lrh.largestRectangleArea(h);
	}
	
	// http://www.geeksforgeeks.org/largest-rectangle-under-histogram/
	
	public int largestRectangleArea(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        int ans = 0;
        
        while(i<height.length){
            if(stack.empty()||height[stack.peek()]<=height[i]){
                stack.add(i++);
            } else {
                int id = stack.pop();
                int area = height[id] * (stack.empty() ? i : i-stack.peek()-1); // attention: i
                if(ans<area) ans = area;
            }
        }
        
        while(!stack.empty()){
            int id = stack.pop();
            int area = height[id] * (stack.empty() ? i : i-stack.peek()-1); // attention: i
            if(ans<area) ans = area;
        }
        
        return ans;
    }
}

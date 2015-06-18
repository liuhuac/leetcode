package edu.clemson.ece.leetcode.ContainerWithMostWater;

public class ContainerWithMostWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxArea(int[] height) {
        if(1>=height.length) return 0;
        int l = 0;
        int r = height.length-1;
        int max = 0;
        while(l<r){
            int a = Math.min(height[l], height[r]) * (r - l);
            if(a>max) max = a;
            if(height[l]<height[r]){
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}

package edu.clemson.ece.leetcode.TrappingRainWater;

public class TrappingRainWater {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int sechigh = 0;
        int water = 0;
        while(left<right){
            if(height[left]>height[right]){
                sechigh = Math.max(height[right],sechigh);
                water += sechigh - height[right--];
            } else {
                sechigh = Math.max(height[left],sechigh);
                water += sechigh - height[left++];
            }
        }
        return water;
    }
}

package edu.clemson.ece.leetcode.JumpGameII;

public class JumpGameII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int jump(int[] nums) {
        int n = nums.length;
        if(1==n) return 0;
        int farthest = 0;
        int pre = 0;
        int step = 0;
        for(int i=0; i<n; i++){
            if(i+nums[i]>=n-1) return ++step;
            if(i+nums[i]>farthest){
                farthest = i + nums[i];
            }
            if(i==pre){
                if(farthest==pre) return -1;
                pre = farthest;
                step++;
            }
        }
        return -1;
    }
}

package edu.clemson.ece.leetcode.IncreasingTripletSubsequence;

public class IncreasingTripletSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean increasingTriplet(int[] nums) {
        int small = 0;
        int medium = -1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[small]){
                small = i;
            } else if(nums[i]>nums[small]){
                if(medium==-1){
                    medium = i;
                } else {
                    if(nums[i]>nums[medium]){
                        return true;
                    } else{
                        medium = i;
                    }
                }
            }
        }
        return false;
    }
}

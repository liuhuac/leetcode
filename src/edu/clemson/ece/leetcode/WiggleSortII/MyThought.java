package edu.clemson.ece.leetcode.WiggleSortII;

public class MyThought {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void wiggleSort(int[] nums) {
        if(nums.length<2) return;
        
        if(nums[0]>nums[1]){
            int tmp = nums[0];
            nums[0] = nums[1];
            nums[1] = tmp;
        }
        
        int i = 0;
        int j = 1;
        int k = 2;
        
        while(k<nums.length){
            //if()
        }
    }
}

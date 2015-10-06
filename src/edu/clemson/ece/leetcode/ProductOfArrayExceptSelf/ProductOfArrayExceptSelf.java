package edu.clemson.ece.leetcode.ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prod = 1;
        for(int i=0; i<nums.length; i++){
            res[i] = prod;
            prod *= nums[i];
        }
        prod = 1;
        for(int i=nums.length-1; i>=0; i--){
            res[i] *= prod;
            prod *= nums[i];
        }
        return res;
    }
}

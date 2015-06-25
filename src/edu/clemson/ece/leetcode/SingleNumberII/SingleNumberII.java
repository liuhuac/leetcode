package edu.clemson.ece.leetcode.SingleNumberII;

public class SingleNumberII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumberII sn = new SingleNumberII();
		int[] nums = new int[]{1};
		System.out.print(sn.singleNumber(nums));
	}
	public int singleNumber(int[] nums) {
        int bits = 32;
        int[] count = new int[bits];
        for(int i=0; i<nums.length; i++){
            int number = nums[i];
            for(int j=0; j<bits; j++){
                count[bits-j-1] += number & 1;
                number = number >> 1;
            }
        }
        int result = 0;
        for(int j=0; j<bits-1; j++){
            if(0!=count[j]%3) {
                result = result ^ 1;
            }
            result = result << 1;
        }
        if(0!=count[bits-1]%3) {
                result = result ^ 1;
            }
        return result;
    }
}

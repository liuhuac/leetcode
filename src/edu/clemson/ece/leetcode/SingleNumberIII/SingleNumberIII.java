package edu.clemson.ece.leetcode.SingleNumberIII;

public class SingleNumberIII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] singleNumber(int[] nums) {
        int diff = 0;
        for(int n : nums){
            diff ^= n;
        }
        diff = Integer.highestOneBit(diff);
        int[] res = new int[]{0,0};
        for(int n : nums){
            if((n&diff)==0){
                res[1] ^= n;
            } else {
                res[0] ^= n;
            }
        }
        return res;
    }
}

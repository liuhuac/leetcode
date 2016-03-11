package edu.clemson.ece.leetcode.PatchingArray;

public class PatchingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minPatches(int[] nums, int n) {
        long miss = 1; // miss is long type in case of n=2147483647
        int i = 0;
        int added = 0;
        while(miss<=n){ // do not forget miss==n
            if(i<nums.length && nums[i]<=miss){
                miss += nums[i++];
            } else {
                miss += miss;
                added++;
            }
        }
        return added;
    }
}

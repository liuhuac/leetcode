package edu.clemson.ece.leetcode.FindPeakElement;

public class FindPeakElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findPeakElement(int[] nums) {
        if(1==nums.length) return 0;
        if(nums[0]>nums[1]) return  0;
        if(nums[nums.length-2]<nums[nums.length-1]) return  nums.length-1;
        int a = 0;
        int b = 1;
        int c = 2;
        while(c<nums.length){
            if(nums[a]<nums[b]&&nums[b]>nums[c]) return b;
            a++;
            b++;
            c++;
        }
        return -1;
    }
}

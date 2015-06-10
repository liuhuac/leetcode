package edu.clemson.ece.leetcode.MajorityElement;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 0;
        for(int n : nums){
            if(n==majority){
                count++;
            } else {
                count--;
            }
            if(0==count){
                majority = n;
                count = 1;
            }
        }
        return majority;
    }

}

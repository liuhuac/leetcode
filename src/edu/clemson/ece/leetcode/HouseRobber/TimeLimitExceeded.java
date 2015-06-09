package edu.clemson.ece.leetcode.HouseRobber;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TimeLimitExceeded e = new TimeLimitExceeded();
		int[] nums = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
		System.out.println(e.rob(nums));
	}

	public int rob(int[] nums) {
        return consider(nums, nums.length);
    }
    
    public int consider(int[] nums, int k){
        if(0==k){
            return 0;
        }
        if(1==k){
            return nums[0];
        }
        return Math.max(consider(nums,k-2)+nums[k], consider(nums, k-1));
    }
}

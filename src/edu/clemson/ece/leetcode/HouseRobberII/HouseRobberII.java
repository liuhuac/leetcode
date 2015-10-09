package edu.clemson.ece.leetcode.HouseRobberII;

public class HouseRobberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseRobberII hr = new HouseRobberII();
		int[] nums = new int[]{1,3,1,3,100};
		System.out.println(hr.rob(nums));
	}
	public int rob(int[] nums) {
        int length = nums.length;
        if(length==0) return 0;
        if(length==1) return nums[0];
        if(length==2) return nums[0]>nums[1] ? nums[0] : nums[1];
        int a = subrob(nums, 0, length-2);
        int b = subrob(nums, 1, length-1);
        return a>b ? a : b;
    }
    public int subrob(int[] nums, int start, int end){
        int length = end-start+1;
        if(length==1) return nums[start];
        if(length==2) return nums[start]>nums[end] ? nums[start] : nums[end];
        int[] res = new int[length];
        res[0] = nums[start];
        res[1] = nums[start]>nums[start+1] ? nums[start] : nums[start+1];
        for(int i=2; i<length; i++){
            res[i] = res[i-2]+nums[start+i]>res[i-1] ? res[i-2]+nums[start+i] : res[i-1];
        }
        return res[length-1];
    }
}

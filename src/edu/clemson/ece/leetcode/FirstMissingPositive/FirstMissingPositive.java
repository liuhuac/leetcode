package edu.clemson.ece.leetcode.FirstMissingPositive;

public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstMissingPositive fmp = new FirstMissingPositive();
		int[] nums = new int[]{2,1};
		fmp.firstMissingPositive(nums);
	}
	public int firstMissingPositive(int[] nums) {
        for(int i=0; i<nums.length; i++){
            while(nums[i]>0&&nums[i]<=nums.length&&nums[nums[i]-1]!=nums[i]){
                int tmp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = tmp;
                
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i+1) return i+1;
        }
        return nums.length + 1;
    }
}

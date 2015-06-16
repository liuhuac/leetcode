package edu.clemson.ece.leetcode.SearchInsertPosition;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int searchInsert(int[] nums, int target) {
        int i = 0;
        for(; i<nums.length && nums[i]<target; i++){
            if(target==nums[i]){
                return i;
            }
        }
        return i;
    }
}

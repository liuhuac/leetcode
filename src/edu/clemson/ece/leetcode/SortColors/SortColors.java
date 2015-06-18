package edu.clemson.ece.leetcode.SortColors;

public class SortColors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void sortColors(int[] nums) {
        int r = 0;
        int b = nums.length - 1;
        int scan = 0;
        while(scan<=b){
            if(0==nums[scan]){
                if(r==scan){
                    r++;
                    scan++;
                } else {
                    nums = swap(nums, r++, scan);
                }
            } else if (2==nums[scan]){
                if(scan==b){
                    b--;
                    scan++;
                } else {
                    nums = swap(nums, scan, b--);
                }
            } else {
                scan++;
            }
        }
    }
    public int[] swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        return nums;
    }
}

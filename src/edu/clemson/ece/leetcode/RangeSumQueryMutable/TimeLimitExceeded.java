package edu.clemson.ece.leetcode.RangeSumQueryMutable;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	
	private int[][] sum;
    
    public TimeLimitExceeded(int[] nums) {
        sum = new int[nums.length][nums.length];
        for(int i=0; i<nums.length; i++){
            sum[i][i] = nums[i];
        }
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                sum[i][j] = sum[i][j-1]+nums[j];
            }
        }
    }

    void update(int i, int val) {
        int diff = val - sum[i][i];
        for(int k=0; k<=i; k++){
            for(int j=i; j<sum[0].length; j++){
                sum[k][j] += diff;
            }
        }
    }

    public int sumRange(int i, int j) {
        return sum[i][j];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package edu.clemson.ece.leetcode.RangeSumQueryMutable;

public class NumArray {

	/**
	 * @param args
	 */
	
	private int[] BIT;
    private int len;
    
    public NumArray(int[] nums) {
        len = nums.length+1;
        BIT = new int[len];
        for(int i=0; i<nums.length; i++){
            int k = i+1;
            while(k<len){
                BIT[k] += nums[i];
                k += k&-k;
            }
        }
    }

    void update(int i, int val) {
        int diff = val - (getSum(i)-getSum(i-1));
        int k = i+1;
        while(k<len){
            BIT[k] += diff;
            k += k&-k;
        }
    }
    
    private int getSum(int i){
        int k = i+1;
        int sum = 0;
        while(k>0){
            sum += BIT[k];
            k -= k&-k;
        }
        return sum;
    }

    public int sumRange(int i, int j) {
        return getSum(j)-getSum(i-1);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

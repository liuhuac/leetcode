package edu.clemson.ece.leetcode.CountingBits;

public class CountingBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] countBits(int num) {
        int[] ans = new int[num+1];
        ans[0] = 0;
        int k = 0; // a variable that keeps track of the range of 2^k
        for(int i=1; i<=num; i++){
            int range = (int)Math.pow(2,k);
            if(i==range){
                k++;
                ans[i] = 1;
            } else {
                ans[i] = ans[i%(range/2)] + 1;
            }
        }
        return ans;
    }
}

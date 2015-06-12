package edu.clemson.ece.leetcode.NumberOf1Bits;

public class NumberOf1BitsWrongAnswer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberOf1BitsWrongAnswer nb = new NumberOf1BitsWrongAnswer();
		System.out.println(Long.MAX_VALUE);
	}

	public int hammingWeight(int n) {
        if(Integer.MAX_VALUE<n){
            return 0;
        }
        if(0==n){
            return 0;
        }
        int count = 0;
        while(0!=n){
            if(1==n%2){
                count++;
            }
            n = n/2;
        }
        return count;
    }
}

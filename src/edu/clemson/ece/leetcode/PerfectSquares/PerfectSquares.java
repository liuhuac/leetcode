package edu.clemson.ece.leetcode.PerfectSquares;

public class PerfectSquares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int numSquares(int n) {
        int[] ans = new int[n+1];
        for(int i=1; i<=n; i++){
            ans[i] = Integer.MAX_VALUE;
        }
        ans[0] = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j*j<=i; j++){
                if(ans[i]>ans[i-j*j]+1){
                    ans[i] = ans[i-j*j]+1;
                }
            }
        }
        return ans[n];
    }
}

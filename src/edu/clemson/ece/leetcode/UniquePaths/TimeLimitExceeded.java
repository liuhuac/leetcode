package edu.clemson.ece.leetcode.UniquePaths;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeLimitExceeded tle = new TimeLimitExceeded();
		System.out.println(tle.uniquePaths(19, 13));
	}

	public int uniquePaths(int m, int n) {
        if(1==m){
            return 1;
        }
        if(1==n){
            return 1;
        }
        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }
}

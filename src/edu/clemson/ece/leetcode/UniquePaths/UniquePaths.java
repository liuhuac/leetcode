package edu.clemson.ece.leetcode.UniquePaths;

public class UniquePaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePaths up = new UniquePaths();
		System.out.println(up.uniquePaths(19, 13));
	}

	public int uniquePaths(int m, int n) {
        int[][] sol = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(0==i || 0==j){
                    sol[i][j] = 1;
                } else {
                    sol[i][j] = sol[i-1][j] + sol[i][j-1];
                }
            }
        }
        return sol[m-1][n-1];
    }
	
}

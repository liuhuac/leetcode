package edu.clemson.ece.leetcode.MinimumPathSum;

public class MinimumPathSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minPathSum(int[][] grid) {
        if(null==grid) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] ms = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(0==i&&0==j) {
                    ms[i][j] = grid[i][j];
                } else if(0==i){
                    ms[i][j] = ms[i][j-1] + grid[i][j];
                } else if(0==j){
                    ms[i][j] = ms[i-1][j] + grid[i][j];
                } else {
                    ms[i][j] = Math.min(ms[i][j-1], ms[i-1][j]) + grid[i][j];
                }
            }
        }
        return ms[m-1][n-1];
    }
	
}

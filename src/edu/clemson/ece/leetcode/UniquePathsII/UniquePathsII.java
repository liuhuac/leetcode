package edu.clemson.ece.leetcode.UniquePathsII;

public class UniquePathsII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePathsII uPath = new UniquePathsII();
		int[][] grid = new int[][]{{0,0}};
		System.out.print(uPath.uniquePathsWithObstacles(grid));
	}

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        if(0==n) return 0;
        int m = obstacleGrid[0].length;
        int[] up = new int[m];
        int left = 0;
        for(int i=0; i<n; i++){
        	left = 0==i ? 1 : 0;
            for(int j=0; j<m; j++){
                if(1==obstacleGrid[i][j]){
                    up[j] = 0;
                } else {
                    up[j] = left + up[j];
                }
                left = up[j];
            }
        }
        return up[m-1];
    }
}

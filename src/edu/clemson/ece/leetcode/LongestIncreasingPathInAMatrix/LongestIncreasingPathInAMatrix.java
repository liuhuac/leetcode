package edu.clemson.ece.leetcode.LongestIncreasingPathInAMatrix;

public class LongestIncreasingPathInAMatrix {

	/**
	 * @param args
	 */
	
	int[][] pos = {{-1,0},{0,-1},{0,1},{1,0}};
	
    public int longestIncreasingPath(int[][] matrix) {
        int longest = 0;
        if(matrix.length==0) return longest;
        int[][] cache = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                longest = Math.max(helper(matrix, cache, i, j), longest);
            }
        }
        return longest;
    }
    
    public int helper(int[][] matrix, int[][] cache, int i, int j) {
        if(cache[i][j]!=0) return cache[i][j];
        cache[i][j] = 1;
        for(int[] p : pos){
            if(i+p[0]>=0 && i+p[0]<matrix.length 
                && j+p[1]>=0 && j+p[1]<matrix[0].length
                && matrix[i][j]<matrix[i+p[0]][j+p[1]]){
                
                cache[i][j] = Math.max(helper(matrix, cache, i+p[0], j+p[1])+1, cache[i][j]);
            }
        }
        return cache[i][j];
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

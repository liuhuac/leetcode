package edu.clemson.ece.leetcode.SearchA2DMatrixII;

public class SearchA2DMatrixII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target) return true;
            if(matrix[row][col]<target) {row++; continue;}
            if(matrix[row][col]>target) {col--; continue;}
        }
        return false;
    }
}

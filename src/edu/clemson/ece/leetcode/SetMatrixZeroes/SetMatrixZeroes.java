package edu.clemson.ece.leetcode.SetMatrixZeroes;

public class SetMatrixZeroes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setZeroes(int[][] matrix) {
        boolean rw = false;
        boolean cw = false;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(0==matrix[i][j]){
                    if(0==i) rw = true;
                    if(0==j) cw = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(0==matrix[0][j]||0==matrix[i][0]){
                    matrix[i][j] = 0;
                }
            }
        }
        if(rw){
            for(int j=0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
        if(cw){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
    }
}

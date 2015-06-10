package edu.clemson.ece.leetcode.RotateImage;

public class RotateImage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void rotate(int[][] matrix) {
        matrix = foldDiagnal(matrix);
        matrix = foldVertical(matrix);
    }
	
    public int[][] foldDiagnal(int[][] matrix){
        if(0==matrix[0].length){
            return null;
        }
        for(int i=0; i<matrix[0].length; i++){
            for(int j=i; j<matrix[0].length; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        return matrix;
    }
    
    public int[][] foldVertical(int[][] matrix){
        if(0==matrix[0].length){
            return null;
        }
        int l = 0;
        int r = matrix[0].length-1;
        while(l<r){
            for(int i=0; i<matrix[0].length; i++){
                int tmp = matrix[i][r];
                matrix[i][r] = matrix[i][l];
                matrix[i][l] = tmp;
            }
            l++;
            r--;
        }
        return matrix;
    }
}

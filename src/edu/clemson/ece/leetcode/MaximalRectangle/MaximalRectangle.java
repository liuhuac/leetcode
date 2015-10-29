package edu.clemson.ece.leetcode.MaximalRectangle;

import java.util.Arrays;

public class MaximalRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximalRectangle mr = new MaximalRectangle();
		char[][] m = new char[][]{{'1','0'}};
		mr.maximalRectangle(m);
	}
	public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        if(m==0) return 0;
        int n = matrix[0].length;
        int[] height = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left,Integer.MIN_VALUE);
        Arrays.fill(right,Integer.MAX_VALUE);
        int ans = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }
            
            int curleft = 0;
            int curright = n;
            
            for(int j=0; j<n; j++){
                if(matrix[i][j]=='1'){
                    left[j] = Math.max(left[j],curleft);
                } else {
                    left[j] = 0;
                    curleft = j + 1;
                }
            }
            
            for(int j=n-1; j>=0; j--){
                if(matrix[i][j]=='1'){
                    right[j] = Math.min(right[j],curright);
                } else {
                    right[j] = n;
                    curright = j;
                }
            }
            
            for(int j=0; j<n; j++){
                ans = Math.max(ans,(right[j]-left[j])*height[j]);
            }
        }
        
        return ans;
    }
}

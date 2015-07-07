package edu.clemson.ece.leetcode.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        int n = matrix.length;
        if(0==n) return res;
        int m = matrix[0].length;
        int layer = (Math.min(n,m) + 1) / 2;
        for(int l = 0; l<layer; l++){
            if(l==layer-1){
                if(n>m){
                    if(0==m%2){
                        res.add(matrix[l][l]);
                        for(int i=l; i<=n-1-l; i++) res.add(matrix[i][m-1-l]);
                        for(int i=n-1-l; i>l; i--) res.add(matrix[i][l]);
                    } else {
                        for(int i=l; i<=n-1-l; i++) res.add(matrix[i][m-1-l]);
                    }
                } else if(n<m){
                    if(0==n%2){
                        for(int j=l; j<=m-1-l; j++) res.add(matrix[l][j]);
                        for(int j=m-1-l; j>=l; j--) res.add(matrix[n-1-l][j]);
                    } else {
                        for(int j=l; j<=m-1-l; j++) res.add(matrix[l][j]);
                    }
                } else {
                    if(0==n%2){
                        res.add(matrix[l][l]);
                        res.add(matrix[l][l+1]);
                        res.add(matrix[l+1][l+1]);
                        res.add(matrix[l+1][l]);
                    } else {
                        res.add(matrix[l][l]);
                    }
                }
                continue;
            }
            for(int j=l; j<m-1-l; j++) res.add(matrix[l][j]);
            for(int i=l; i<n-1-l; i++) res.add(matrix[i][m-1-l]);
            for(int j=m-1-l; j>l; j--) res.add(matrix[n-1-l][j]);
            for(int i=n-1-l; i>l; i--) res.add(matrix[i][l]);
        }
        return res;
    }
}

package edu.clemson.ece.leetcode.Triangle;

import java.util.List;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minimumTotal(List<List<Integer>> triangle) {
        int h = triangle.size();
        int[] row = new int[h];
        for(int i=h-1; i>=0; i--){
            row[i] = triangle.get(h-1).get(i);
        }
        for(int i=h-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                row[j] = triangle.get(i).get(j) + Math.min(row[j], row[j+1]);
            }
        }
        return row[0];
    }
}

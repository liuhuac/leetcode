package edu.clemson.ece.leetcode.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PascalsTriangleII pt = new PascalsTriangleII();
		System.out.println(pt.getRow(33).toString());
	}

	public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        for(int i=0; i<=rowIndex; i++){
            row.add(1);
            for(int j=i-1; j>0; j--){
                row.set(j, row.get(j)+row.get(j-1));
            }
        }
        return row;
    }
}

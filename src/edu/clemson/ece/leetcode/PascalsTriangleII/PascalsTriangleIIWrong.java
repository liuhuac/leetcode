package edu.clemson.ece.leetcode.PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleIIWrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PascalsTriangleIIWrong pt = new PascalsTriangleIIWrong();
		System.out.println(pt.getRow(33).toString());
	}

	public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        for(int i=0; i<=rowIndex; i++){
            row.add(combination(rowIndex+1,i));
        }
        return row;
    }
    
    public int combination(int n, int k){
        return factorial(n)/(factorial(k)*factorial(n-k));
    }
    
    public int factorial(int n){
        if(0==n||1==n){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
}

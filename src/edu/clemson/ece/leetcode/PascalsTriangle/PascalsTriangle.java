package edu.clemson.ece.leetcode.PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        for(int i=0; i<numRows; i++){
            int length = i + 1;
            pascal.add(new ArrayList<Integer>());
            for(int j=0; j<length; j++){
                if(0==i){
                    pascal.get(i).add(1);
                } else {
                    if(0==j){
                        pascal.get(i).add(1);
                    } else if (length-1==j) {
                        pascal.get(i).add(1);
                    } else {
                        pascal.get(i).add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
                    }
                }
            }
        }
        return pascal;
    }
}

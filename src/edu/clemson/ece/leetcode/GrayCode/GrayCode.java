package edu.clemson.ece.leetcode.GrayCode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<Integer> grayCode(int n) {
        if(0==n){
            List<Integer> tmp = new ArrayList<Integer>();
            tmp.add(0);
            return tmp;
        }
        if(1==n){
            List<Integer> tmp = new ArrayList<Integer>();
            tmp.add(0);
            tmp.add(1);
            return tmp;
        }
        List<Integer> list = grayCode(n-1);
        List<Integer> result = new ArrayList<Integer>(list);
        int inc = (int)Math.pow(2, n-1);
        for(int i=0; i<list.size(); i++){
            result.add(list.get(list.size()-1-i) + inc);
        }
        return result;
    }
}

package edu.clemson.ece.leetcode.Combinations;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> combine(int n, int k) {
        if(1==k){
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            for(int i=1; i<=n; i++){
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.add(i);
                result.add(tmp);
            }
            return result;
        }
        if(n==k){
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i=1; i<=n; i++){
                tmp.add(i);
            }
            result.add(tmp);
            return result;
        }
        List<List<Integer>> list1 = combine(n-1, k-1);
        for(List<Integer> l : list1){
            l.add(n);
        }
        List<List<Integer>> list2 = combine(n-1, k);
        list2.addAll(list1);
        return list2;
    }
}

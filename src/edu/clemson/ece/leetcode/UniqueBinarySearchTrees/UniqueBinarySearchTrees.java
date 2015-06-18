package edu.clemson.ece.leetcode.UniqueBinarySearchTrees;

public class UniqueBinarySearchTrees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(-1%5);
	}
	
	public int numTrees(int n) {
        int[] t = new int[n+1];
        t[0] = 1;
        t[1] = 1;
        for(int i=2; i<n+1; i++){
            t[i] = 0;
            for(int j=0; j<i; j++){
                t[i] += t[j]*t[i-1-j];
            }
        }
        return t[n];
    }

}

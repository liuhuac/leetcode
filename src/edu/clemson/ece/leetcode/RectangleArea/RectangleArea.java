package edu.clemson.ece.leetcode.RectangleArea;

public class RectangleArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int sABCD = (C-A)*(D-B);
        int sEFGH = (G-E)*(H-F);
        int left = Math.max(A,E);
        int right = Math.min(C,G);
        int bottom = Math.max(B,F);
        int top = Math.min(D,H);
        int overlap = 0;
        if(top>bottom&&right>left){
            overlap = (top-bottom)*(right-left);
        }
        return sABCD+sEFGH-overlap;
    }

}

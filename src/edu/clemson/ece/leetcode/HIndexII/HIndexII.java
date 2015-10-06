package edu.clemson.ece.leetcode.HIndexII;

public class HIndexII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int hIndex(int[] citations) {
        int hIndex = 0;
        for(int i=citations.length-1; i>=0; i--){
            if(citations[i]>=(citations.length-i)){
                hIndex = citations.length-i;
            } else {
                break;
            }
        }
        return hIndex;
    }
}

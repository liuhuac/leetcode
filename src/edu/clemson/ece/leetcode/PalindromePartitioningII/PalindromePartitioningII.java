package edu.clemson.ece.leetcode.PalindromePartitioningII;

public class PalindromePartitioningII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromePartitioningII pp = new PalindromePartitioningII();
		pp.minCut("bb");
	}

	public int minCut(String s) {
        int[] min = new int[s.length()+1];
        for(int i=0; i<s.length()+1; i++) min[i] = i-1;
        for(int i=0; i<s.length(); i++){
            for(int j=0; i-j>=0 && i+j<s.length() && s.charAt(i-j)==s.charAt(i+j); j++) 
                min[i+j+1]=Math.min(min[i+j+1],min[i-j]+1);
            for(int j=1; i-j+1>=0 && i+j<s.length() && s.charAt(i-j+1)==s.charAt(i+j); j++) // j=1, i+1-j, i+j
                min[i+1+j]=Math.min(min[i+1+j],min[i-j+1]+1);
        }
        return min[s.length()];
    }
}

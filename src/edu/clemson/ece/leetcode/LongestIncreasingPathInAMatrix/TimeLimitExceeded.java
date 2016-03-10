package edu.clemson.ece.leetcode.LongestIncreasingPathInAMatrix;

public class TimeLimitExceeded {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] data = new int[][]{{0,1,2,3,4,5,6,7,8,9},{19,18,17,16,15,14,13,12,11,10},{20,21,22,23,24,25,26,27,28,29},{39,38,37,36,35,34,33,32,31,30},{40,41,42,43,44,45,46,47,48,49},{59,58,57,56,55,54,53,52,51,50},{60,61,62,63,64,65,66,67,68,69},{79,78,77,76,75,74,73,72,71,70},{80,81,82,83,84,85,86,87,88,89},{99,98,97,96,95,94,93,92,91,90},{100,101,102,103,104,105,106,107,108,109},{119,118,117,116,115,114,113,112,111,110},{120,121,122,123,124,125,126,127,128,129},{139,138,137,136,135,134,133,132,131,130},{0,0,0,0,0,0,0,0,0,0}};
		TimeLimitExceeded tle = new TimeLimitExceeded();
		int length = tle.longestIncreasingPath(data);
		System.out.println(length);
	}

	int[][] pos = {{-1,0},{0,-1},{0,1},{1,0}};
    public int longestIncreasingPath(int[][] matrix) {
        int longest = 0;
        if(matrix.length==0) return longest;
        int[][] flag = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
            	System.out.println("processing "+i+" "+j);
                longest = Math.max(helper(matrix, flag, i, j), longest);
            }
        }
        return longest;
    }
    
    public int helper(int[][] matrix, int[][] flag, int i, int j) {
        int longest = 1;
        for(int[] p : pos){
            if(i+p[0]>=0 && i+p[0]<matrix.length 
                && j+p[1]>=0 && j+p[1]<matrix[0].length
                && flag[i+p[0]][j+p[1]]==0
                && matrix[i][j]<matrix[i+p[0]][j+p[1]]){
                
            	System.out.println("  hlper processing "+i+" "+j);
            	
                flag[i][j] = 1;// not flag[i+p[0]][j+p[1]] = 1;
                longest = Math.max(helper(matrix, flag, i+p[0], j+p[1])+1, longest);
                flag[i][j] = 0;// not flag[i+p[0]][j+p[1]] = 0;
            }
        }
        return longest;
    }
}
